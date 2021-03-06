pipeline {
    agent none

    options {
        buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1'))
    }

    stages {

        stage('Unit Tests') {
            agent {
                label 'apache'
            }

            steps {
                echo 'Unit testing....'
                sh 'mvn test'
            }
        }

        stage('Build') {
            agent {
                label 'apache'
            }

            steps {
                echo 'Building....'
                sh 'mvn clean package'
            }

            post {
               success {
                   archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
               }
            }
        }

        stage('Deploy') {
            agent {
                label 'apache'
            }
            steps {
                echo 'Deploying....'
                sh 'cp target/Java-TestNG-Selenium-1.0-SNAPSHOT.jar /var/www/html/rectangles/all'
            }
        }

        stage('Running on CentOS'){
            agent {
                label 'apache'
            }

            steps {
                echo 'Downloading and running in different environment'
                sh "wget http://52.65.85.163/rectangles/all/Java-TestNG-Selenium-1.0-SNAPSHOT.jar"
                sh "java -jar /var/www/html/rectangles/all/Java-TestNG-Selenium-1.0-SNAPSHOT.jar 3 4"
            }
        }

        stage('Test on Debian'){
            agent {
                docker 'openjdk:8'
            }

            steps{
                echo 'Downloading and running in docker environment'
                sh "wget http://52.65.85.163/rectangles/all/Java-TestNG-Selenium-1.0-SNAPSHOT.jar"
                sh "java -jar Java-TestNG-Selenium-1.0-SNAPSHOT.jar 3 4"
            }
        }

        stage('Promote to Green'){
            agent {
                label 'apache'
            }
            steps {
                sh "cp /var/www/html/rectangles/all/Java-TestNG-Selenium-1.0-SNAPSHOT.jar /var/www/html/rectangles/green/Java-TestNG-Selenium-1.0-SNAPSHOT.jar"
            }
        }
     }
}
