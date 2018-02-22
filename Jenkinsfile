pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven() {
                    echo 'Building....'
                    sh 'mvn clean package'
                }
            }
        }
     }
}
