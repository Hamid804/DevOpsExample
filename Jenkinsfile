pipeline {
    agent any
    triggers {
    	pollSCM '* * * * *'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                bat 'mvn install'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t devopsimage .'
            }
        }

    }
}