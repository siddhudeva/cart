pipeline {
  agent{
  label 'WORKSTATION'
  }
  stages {
    stage('compile the code'){
       steps {
          sh 'echo code compilation'
       }
    }
    stage('Sonarqube') {
      steps {
         sh 'echo sonarqube code coverage'
      }
    }
    stage('lint chechks') {
       steps {
         sh 'echo netive language lint checks'
       }
    }
    stage('code check quality') {
      steps {
        sh 'echo codechekings'
      }
    }
    stage('prepare artifacts') {
      steps {
        sh 'echo Prepare artifacts'
      }
    }
    stage('publish artifacts') {
      steps {
        sh 'echo publish artifacts'
      }
    }
  }
  post {
    always {
      cleanWS {}
    }
  }
}