pipeline {
    agent any
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
             archive 'target/*.jar'
         }
      }
}
