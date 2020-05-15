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
                branch 'develop';
            }
            steps {
                withCredentials([usernamePassword(credentialsId: 'cognicrypt', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
      		  		 sh '''
                    sshpass -p $PASS ssh -p 22022 -o StrictHostKeyChecking=no $USER@crossing.cdc.informatik.tu-darmstadt.de rm -rf /var/www/cognicrypt/snapshots
                    sshpass -p $PASS ssh -p 22022 -o StrictHostKeyChecking=no $USER@crossing.cdc.informatik.tu-darmstadt.de mkdir -p /var/www/cognicrypt/snapshots
                    sshpass -p $PASS scp -P 22022 -r de.darmstadt.tu.crossing.CrySL.repository/target/repository/* $USER@crossing.cdc.informatik.tu-darmstadt.de:/var/www/cognicrypt/snapshots
                    '''
               }
	        }
		}
		stage('Publish Release'){
            when { 
                branch 'master';
            }
            steps {
                withCredentials([usernamePassword(credentialsId: 'cognicrypt', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
      		  		 sh '''
                    sshpass -p $PASS ssh -p 22022 -o StrictHostKeyChecking=no $USER@crossing.cdc.informatik.tu-darmstadt.de rm -rf /var/www/cognicrypt/stable
                    sshpass -p $PASS ssh -p 22022 -o StrictHostKeyChecking=no $USER@crossing.cdc.informatik.tu-darmstadt.de mkdir -p /var/www/cognicrypt/stable
                    sshpass -p $PASS scp -P 22022 -r de.darmstadt.tu.crossing.CrySL.repository/target/repository/* $USER@crossing.cdc.informatik.tu-darmstadt.de:/var/www/cognicrypt/stable
                    '''
               }
	        }
		}
	}
}
