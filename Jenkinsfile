pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1'))
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                sh 'mvn clean package'
            }
        }
     }

     post {
         always {
             archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
         }
      }
}
