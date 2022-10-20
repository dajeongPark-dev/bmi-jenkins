pipeline {
<<<<<<< Updated upstream
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit Test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                        reportDir: 'build/reports/jacoco/test/html',
                        reportFiles: 'index.html',
                        reportName: "JaCoCo Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML (target: [
                        reportDir: 'build/reports/checkstyle/',
                        reportFiles: 'main.html',
                        reportName: 'Checkstyle report'
                ])
            }
        }
=======
  agent any
  stages {
    stage('Compile') {
      agent any
      steps {
        sh ' ./gradlew clean '
      }
>>>>>>> Stashed changes
    }

    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }

  }
}