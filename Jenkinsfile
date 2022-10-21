pipeline{
    agent any
    tools{
        maven 'Maven 3.8.6'
        jdk 'jdk17'
    }
    stages{
        stage("Checkout SCM"){
            steps{
                echo "Pulling..."
                checkout([$class: 'GitSCM', branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/Anass001/jenkins-demo']]])
            }
        }
        stage("Build"){
            steps{
                echo "Building..."
                bat "mvn clean"
                bat "mvn compile"
            }
        }
        stage("Test"){
            steps{
                bat "mvn test"
            }
        }
        stage("Deploy"){
            steps{
                bat "mvn package"
                deploy adapters: [tomcat9(credentialsId: '39484b5f-6890-49f2-8e3f-faccaf60a90d', path: '', url: 'http://localhost:5050/')], contextPath: 'JenkinsDemo', war: '**/*.war'
                }
        }
    }
}