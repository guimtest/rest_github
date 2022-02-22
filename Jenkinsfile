node('SLAVE') {
    def mvnHome = tool name: 'maven-3.3', type: 'hudson.tasks.Maven$MavenInstallation'
    try {
        timeout(time: 240, unit: 'MINUTES') {
            timestamps {
                stage 'checkout' {
                    git url: 'https://github.com/guimtest/rest_github.git'
                }
                stage 'build' {
                    sh "${mvnHome}/bin/mvn clean install"
                }
            }
        }
    } catch(e) {
        currentBuild.result = "FAILURE"
        step([$class: 'ClaimPublisher'])
        throw e
    }
}
