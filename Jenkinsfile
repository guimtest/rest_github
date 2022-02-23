def CUSTOM_APPTEAM_USER = "foo_user"
def CUSTOM_APPTEAM_PASS = "foo_pass"

pipeline{
	agent any
	triggers{
		/*cron et git push event*/
		githubPush()
	}

	stages{
		stage('Checkout git'){
			steps{
				/*checkout([
					$class: 'GitScm',
					branches: [[name:"master"]],
					userRemoteConfigs: [[url : 'https://github.com/guimtest/rest_github.git', 
						credentialsId: 'guimtest']]
				])*/
				git([url: 'https://github.com/guimtest/rest_github.git', branch: 'master'])
			}
		}
		stage('build project'){
			steps{
				sh "mvn clean install"
			}
		}
		stage('deploy projet'){
			steps{
				withCredentials([
				    usernamePassword(credentialsId: 'custom_credentials_app', passwordVariable: 'CUSTOM_APPTEAM_PASS', usernameVariable: 'CUSTOM_APPTEAM_USER')
				]) {
					build job: 'deploiement_test', parameters: [[$class: 'StringParameterValue', name: 'environnement', value: 'R5NA']]
				 }
			}
		}
	}

}
