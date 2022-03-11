folder('docker') {
    displayName('docker')
    description('docker')
}
def COMPONENT = ["cart", "frontend", "catalogue", "payment", "shipping", "user", "dispatch"]
def SIZEs =  COMPONENT.size -1
for(i in 0..SIZEs) {
    def s = COMPONENT[i]
    pipelineJob("docker/${s}") {
        configure { flowdefinition ->
            flowdefinition << delegate.'definition'(class: 'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition', plugin: 'workflow-cps') {
                'scm'(class: 'hudson.plugins.git.GitSCM', plugin: 'git') {
                    'userRemoteConfigs' {
                        'hudson.plugins.git.UserRemoteConfig' {
                            'url'("https://github.com/siddhudeva/${s}.git")
                        }
                    }
                    'branches' {
                        'hudson.plugins.git.BranchSpec' {
                            'name'('*/main')
                        }
                    }
                }
                'scriptPath'('Jenkinsfile')
                'lightweight'(true)
            }
        }
    }
}

















// @Library('Roboshop') _
//
// // Variables
// env.COMPONENT = "cart"
// env.BUILD_LABEL = "WORKSTATION"
//
// // Library  Groovy files
// // nodejs()
// // node js is only for mutable approach and for immutable use immutable-nodejs files
// immutable_nodejs()
