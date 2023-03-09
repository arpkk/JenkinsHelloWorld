pipeline {
  agent any
  tools {
      maven "M3"
  }
  stages {
    stage('CleanWorkspace') {
      steps {
        cleanWs()
      }
    }
    stage('Git') {
      steps {
        git branch: 'tomcat', url: 'https://github.com/arpkk/JenkinsHelloWorld.git'
      }
    }
    stage('Vault') {
      steps {
        sh '''
        curl -X 'GET' \
        'http://45.79.52.71:8200/v1/secret/data/foo' \
        -H 'accept: */*' \
        -H 'X-Vault-Token: mysecrettoken' > log.json
        '''
      }
    }
    stage('Build') {
      environment {
        log = readJSON file: 'log.json'
        USERNAME = "${log.data.data.keySet().toList().get(0)}"
        PASSWORD = "${log.data.data.(log.data.data.keySet().toList().get(0))}"
      }
      steps {
        echo "$USERNAME"
        echo "$PASSWORD"
        sh 'export $USERNAME'
        sh 'export $PASSWORD'
        sh 'mvn clean package'
      }
    }
    stage('Deploy to Tomcat') {
      steps {
       script {
          def tomcatUrl = 'http://45.79.52.71:8082/manager/text'
          def warFile = 'HelloWorld-1.0-SNAPSHOT'
          def tomcatUser = 'robot'
          def tomcatPassword = 'robot'

          def response = httpRequest(
            url: "${tomcatUrl}/deploy?path=/my-app&update=true",
            httpMode: 'POST',
            authentication: "${tomcatUser}:${tomcatPassword}",
            uploadFilePath: "${warFile}"
          )
        }
      }
    }
  }
}
