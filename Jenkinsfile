//  pipeline{
//   agent { label 'WORKSTATION' }
//     stages {
//
//         stage( 'compile code' ){
//         steps{
//           sh 'echo compile code'
//         }
//       }
//       stage( 'compile code' ){
//         steps{
//           sh 'check code'
//         }
//       }
//       stage( 'compile code' ){
//         steps{
//           sh ''
//         }
//       }
//     }
//   }

@Library('roboshop')

nodejs.info 'Starting'
nodejs.warning 'Nothing to do!'


pipeline {
  agent any
  stages {

    stage('One-Sequential') {
      steps {
        sh 'sleep 45'
      }
    }

    stage('Two-Parallel') {
      parallel {

        stage('Two1') {
          steps {
            sh 'sleep 60'
          }
        }

        stage('Two2') {
          steps {
            sh 'sleep 90'
          }
        }

      }
    }

  }
}