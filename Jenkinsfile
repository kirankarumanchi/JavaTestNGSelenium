pipeline {
    agent any

    stages {
        stage('Build') {
            Steps {
                echo 'Building....'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            Steps {
                echo 'Testing....'
            }
        }

        stage('Deploy') {
            Steps {
                echo 'Deploying....'
            }
        }
    }
}
