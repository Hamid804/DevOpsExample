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
                bat 'docker build -t my-devopsimage .'
            }
        }
        
        stage('Run Docker Cont') {
            steps {
                bat 'docker run --name devopsContainer3 -it -p 7072:7072 -d my-devopsimage'
            }
        }

    }
}