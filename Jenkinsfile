stage{
	stage('Build'){
		steps {
      mvn sonar:sonar \
      -Dsonar.projectKey=jenkins \
      -Dsonar.host.url=http://localhost:9000 \
      -Dsonar.login=0bb545843b3f687329aa96d0139f659be6793fb3
    }
  }
}
