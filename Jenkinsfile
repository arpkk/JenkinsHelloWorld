pipeline {
	agent any
	tools{
		maven "Maven 3.8.6"
	}
	stages{
		stage('Build Artifact'){
			steps {
				//sh "mvn clean package -DskipTests=true"
				//archive 'target/*.jar'
				mvn sonar:sonar \
				-Dsonar.projectKey=jenkins \
				-Dsonar.host.url=http://localhost:9000 \
				-Dsonar.login=ec91d3612566a6c040152842dbcc762b97f31211
			}
		}
	}
}

