stage{
	stage('Build'){
		steps {
			sh "mvn sonar:sonar \
			  -Dsonar.projectKey=jenkins \
			  -Dsonar.host.url=http://localhost:9000 \
			  -Dsonar.login=ec91d3612566a6c040152842dbcc762b97f31211"
		}
	}
}

