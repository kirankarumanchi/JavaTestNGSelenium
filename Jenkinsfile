pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1'))
    }

    stages {

        stage('Unit Tests') {
            steps {
                echo 'Unit testing....'
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                echo 'Building....'
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'cp target/Java-TestNG-Selenium-1.0-SNAPSHOT.jar /var/www/html/rectangles/all'
            }
        }
     }

     post {
         always {
             archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
         }
      }
}
