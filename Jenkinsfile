pipeline{
	agent any
	/*triggers{
		cron et git push event
	}*/

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
				withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'jenkins']]){
					sh "mvn clean install"
				}
			}
		}
		/*stage('deploy projet'){
			steps{
				try to call another job
			}
		}*/
	}

}
