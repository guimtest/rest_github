pipeline{
	agent {label 'agent-build-1.3.x' }
	/*triggers{
		cron et git push event
	}*/

	stages{
		stage('Checkout git'){
			steps{
				checkout([
					$class: 'GitScm',
					branches: [[name:"master"]],
					userRemoteConfigs: [[url : 'https://github.com/guimtest/rest_github.git', 
						credentialsId: 'jenkins']]
				])
			}
		}
		stage('build project'){
			steps{
				withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'jenkins']]){
					"sh mvn clean install"
				}
			}
		}
		stage('deploy projet'){
			/*try to call another job*/
		}
	}

}
