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
        
        stage('SonarQube Analysis') {
            steps {
            	withSonarQubeEnv('My SonarQube Server') {
            		bat 'mvn sonar:sonar'
                }
            }
        }
        
        stage('Build Docker Image') {
            steps {
                bat 'docker-compose up -d --build'
                
                bat 'docker system prune -f'
            }
        }

    }
}