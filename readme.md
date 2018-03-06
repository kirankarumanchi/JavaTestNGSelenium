# Day 0 Learnings
Once the  AWS is restarted, no need to change the private or public keys
Just change the following:
- In Slave node, just put the slave URL
- In Git and Github plugins, just change the Jenkins new URL
- For GitHub plugin need to always ensure to add the URL with this: /github-webhook/
- Test the service just to get the build automatically triggered 

# Day 1 Learnings
- Created a Maven Project from artifactory
- It created a project in my C:\
- Changed the dependencies as per the need in pom.xml
- Corrected the syntactical or typographic errors in pom.xml 
- Created a .gitignore file
- Added .idea folder in .gitignore file along with any others
- Installed .ignore plugin from File->Settings
- Created a readme.md file and started articulating everything
- Initiated git repository in my local using 'git init'
- Created an empty repository name in my public github repository https://github.com/kirankarumanchi/JavaTestNGSelenium
- verified where my local git repository is pointing to by typing 'git remote -v' in Intellij terminal
- git remote add kkk https://github.com/kirankarumanchi/JavaTestNGSelenium
- git commit
- git push
- Removed the TestNG files for Jenkins Pipeline
- Added the manifest related information and log4j in Pom.xml
- mvn clean
- mvn package
- java -jar ../XXXX.jar N1 N2


 # Day 2 Learnings
 - Install mvn on the Jenkins master using the below commands: 
    - sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
    - sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
    - sudo yum install -y apache-maven
    - mvn –version
 - Ensure to install the Java JDK latest version and associated alternatives
 - Alternatives are like aliases
 - The commands being used are as follows:
    - yum search openjdk devel
    - sudo yum install java-1.8.0-openjdk-devel.x86_64
    - sudo alternatives --config javac
- DO NOT PLACE SPACES in PROJECT NAMES IN JENKINS. Linux doesn't like them well
- 
     post {
        always {
            archive 'target/*.jar'
        }
     }
     
# Day 3 Learnings
- Added a junit class files
- Deployment to Dev environment
- 