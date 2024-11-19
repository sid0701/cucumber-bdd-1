pipeline{
    agent any

    stages{
        stage("stage-1"){
            steps{
                bat "mvn clean test"
            }
        }
        stage("stage-2"){
            steps{
                echo "creating docker image"
            }
        }
        stage("stage-3"){
            steps{
                echo "pushing docker image to docker hub"
            }   
        }
        }
    post{
        always{
            echo "clean up resources"
        }
    }
}