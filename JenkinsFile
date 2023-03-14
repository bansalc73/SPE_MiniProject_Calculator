pipeline{
    agent any
    stages{

        stage('Build'){
            steps {
                dir('/Users/chiragbansal/eclipse-workspace/Calculator_JAVA/src') {
                    /* execute commands in the scripts directory */
                    javac Calculator.java
                    java Calculator
                }
            }
        }
        stage('Test'){
            steps{
                 dir('/Users/chiragbansal/eclipse-workspace/Calculator_JAVA/src') {
                    /* execute commands in the scripts directory */
                    javac CalculatorTest.java
                    java CalculatorTest
                }
                
            }
        }
    }
}
