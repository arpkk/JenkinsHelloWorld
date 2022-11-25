node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn sonar:sonar
	    -Dsonar.projectKey=jenkins \
	    -Dsonar.host.url=http://localhost:9000 \
	    -Dsonar.login=ec91d3612566a6c040152842dbcc762b97f31211"

    }
  }
}


