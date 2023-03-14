pipeline{
    agent any

    enviornment{
        PATH = "/usr/local/Cellar/maven/3.9.0/libexec:$PATH"
    }

    tools{
        maven 'MAVEN'
    } 

    stages{

        stage('Clone Git'){
            steps{
                git 'https://github.com/bansalc73/SPE_MiniProject_Calculator'
            }
        }

        stage('Build'){
            steps {
                // dir('/Users/chiragbansal/eclipse-workspace/Calculator_JAVA/src') {
                //     /* execute commands in the scripts directory */
                //     sh "javac Calculator.java"
                //     sh "java Calculator"
                // }
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            
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
