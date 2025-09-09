pipeline{
    agent any
    tools {
        maven 'MyMaven'
    }
    stages{
        stage('Build Maven App') {

            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/syedkamranprojects/ec2demo.git']])
                bat 'mvn clean install'
            }

        }
        stage('Build Docker Image') {

            steps {
                 script{
                     bat 'docker build -t syedkamran/ec2demo .'
                 }
            }

        }

        stage('Push Docker Image to Docker Hub')
        {
            steps {
                script{
                    withCredentials([string(credentialsId: 'JenkinsDockerHubCred', variable: 'dockerhubpwd')]) {
                         bat 'docker login -u syedkamran -p Docker@Feb@2023'

                         bat 'docker push syedkamran/ec2demo'
                    }

                 }
            }
        }
    }
}