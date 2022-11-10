pipeline {
	agent any
		stage{
			stage('Build'){
				steps {
					sh 'mvn jar:jar install:install'
					sh 'java -cp target/HelloWorld-1.0-SNAPSHOT.jar com.app.App'	
					echo 'This is a pipeline'
					}
				}
			}
	}

