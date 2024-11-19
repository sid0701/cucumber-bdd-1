pipeline{
    agent any

    parameters {
            choice choices: ['chrome', 'firefox'], name: 'Browser',
            choice choices: ['PlaceOrder', 'OffersPage'], name: 'Tag'
        }

    stages{
        stage("stage-1"){
            steps{
                bat "mvn clean test -Dbrowser=${params.Browser} -Dcucumber.filter.tags=@{params.Tag}"
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