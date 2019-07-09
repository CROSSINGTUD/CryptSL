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
                configFileProvider(
	        		[configFile(fileId: '4c86aa82-fbc3-409b-8ca3-9e9bfe0d2cfb', variable: 'update-site-cred')]) {
	        			sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
		      		  		 sh '''
		                    sshpass -p '$update-site-cred' ssh cognicrypt@crossing.cdc.informatik.tu-darmstadt.de rm -rf /var/www/cognicrypt
		                    sshpass -p '$update-site-cred' ssh cognicrypt@crossing.cdc.informatik.tu-darmstadt.de mkdir -p /var/www/cognicrypt
		                    sshpass -p '$update-site-cred' scp -r repository/target/repository/* cognicrypt:@crossing.cdc.informatik.tu-darmstadt.de:/var/www/cognicrypt
		                    '''
	                   }
					}
	        }
		}
	}
}
