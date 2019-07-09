pipeline {
    agent any

    tools {
        jdk 'Oracle JDK 8'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Publish Snapshot'){
            when { 
                branch 'master';
            }
            steps {
                sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
                    sh '''
                    ssh cognicrypt@crossing.cdc.informatik.tu-darmstadt.de -p ${update-site-cred} rm -rf /var/www/cognicrypt
                    ssh cognicrypt@crossing.cdc.informatik.tu-darmstadt.de -p ${update-site-cred}  mkdir -p /var/www/cognicrypt
                    sshpass -p '${update-site-cred}' scp -r repository/target/repository/* cognicrypt:@crossing.cdc.informatik.tu-darmstadt.de:/var/www/cognicrypt
                    '''
                }
            }
        }  
    }
}
