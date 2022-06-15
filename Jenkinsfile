pipeline {
  agent any
  stages {
    stage('Maven Clean'){
    		steps{
    			echo 'Project clean stage'
    			bat label: 'Compilation running', script: '''mvn clean'''
    	       	}
    }

	stage('Maven Compile'){
		steps{
			echo 'Project compile stage'
			bat label: 'Compilation running', script: '''mvn compile'''
	       	}
	}

	stage('Unit Test') {
	   steps {
			echo 'Project Testing stage'
			bat label: 'Test running', script: '''mvn test'''

       		}
   	}

	stage('Jacoco Coverage Report') {
        	steps{
            		jacoco()
		}
	}

    stage('Generate Cucumber report') {
                    steps{
                			cucumber buildStatus: 'null',
                			failedFeaturesNumber: -1,
                			failedScenariosNumber: -1,
                			 failedStepsNumber: -1,
                			 fileIncludePattern: 'target/cucumber.json',
                			 pendingStepsNumber: -1,
                			 skippedStepsNumber: -1,
                			 sortingMethod: 'ALPHABETICAL',
                			 undefinedStepsNumber: -1
                          }
    }

    stage('SonarQube'){
		steps{
				bat label: '', script: '''mvn sonar:sonar \
				-Dsonar.host.url=http://localhost:9000 \
				-Dsonar.login=2b559fb337742dc5e1f6ed23d89ba2d4be9e6b82'''
			}
   		}

	stage('Maven Package'){
		steps{
			echo 'Project packaging stage'
			bat label: 'Project packaging', script: '''mvn package'''
		}
	}

//     stage('Generate Cucumber report') {
//                 steps{
//             			cucumber buildStatus: 'UNSTABLE',
//                     		reportTitle: 'BeerCans Cucumber Report',
//                     		fileIncludePattern: '**/*.json',
//                    			trendsLimit: 10,
//                     		classifications: [
//                         		[
//                             		'key': 'Browser',
//                             		'value': 'Chrome'
//                         		]
//                     		]
//                       }
//     			}

  }
}