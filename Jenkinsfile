pipeline {

    agent any

    tools {
    
        jdk 'JDK21' // Remplacer ici "JDK17" par la version de votre JDK
        
        maven 'Maven3' // Remplacer ici "Maven3" par la version de votre Maven
    
    }
    
    stages {
            
        stage('Build') {
            
            steps {
            
                sh 'mvn clean install'
            
            }
            
        }
            
        stage('Test') {
            
            steps {
            
                sh 'mvn test'
            
            }
            
        }
        stage('Run') {

            steps {
            
            sh 'mvn exec:java'
            
            }
        }
    }
            
    post {
            
        success {
            
            echo 'Pipeline exécuté avec succès!'
            
        }
            
        failure {
            
            echo 'Pipeline échoué!'
            
        }
        
    }

}
