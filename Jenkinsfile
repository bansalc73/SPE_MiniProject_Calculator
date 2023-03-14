pipeline{
    agent any

    stages{

        stage('Clone Git'){
            steps{
                git 'https://github.com/bansalc73/SPE_MiniProject_Calculator'
            }
        }

        stage('Build'){
            steps {
                dir('/Users/chiragbansal/eclipse-workspace/Calculator_JAVA/src') {
                    /* execute commands in the scripts directory */
                    sh "javac Calculator.java"
                    sh "java Calculator"
                }
            }
        }
        stage('Test'){
            steps{
                 dir('/Users/chiragbansal/eclipse-workspace/Calculator_JAVA/src') {
                    /* execute commands in the scripts directory */
                    sh "javac CalculatorTest.java"
                    sh "java CalculatorTest"
                }
                
            }
        }
    }
}
