pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Building....'
                sh 'mvn clean package'
            }
        }
     }
}
