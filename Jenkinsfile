pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                sh 'sudo mvn clean package'
            }
        }
     }
}
