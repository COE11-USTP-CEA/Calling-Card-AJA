#Calling Card webpage by Aja

##Program Description

      Calling Card Directory is a webpage that displays contact information of 
      any individual who are signed in the page. It contains the person's information 
      such as address, contact number, email , etc.. With the help of this webpage
      you can be connected with the world
      
##How to install Maven

* Download and install java [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Create user variable for java development kit(jdk)

            path=%path%;<paste the file path of your java development kit(jdk) bin>
            e.g - path=%path%;C:\Program Files\Java\jdk1.8.0_111\bin
            
* Download [apache-maven](http://maven.apache.org/download.cgi)
* Create system variable JAVA_HOME
      
            echo=%JAVA_HOME%
            path=%JAVA_HOME%;<paste the file path of your apache-maven here>
            e.g -  path=%JAVA_HOME%;C:\Program Files\Java\jdk1.8.0_111
      
* Create user variable for maven

            path=%path%;%JAVA_HOME%/bin
            path=%path%;<paste the file path of your apache-maven bin>
            e.g - path=%path%;C:\Program Files\Maven\apache-maven-3.3.9\bin\
     
* Verify
      
            java
            javac
            mvn -v
      
      
Visit [Maven](http://maven.apache.org/install.html) for more info

##Routes

      localhost:4567 - landing page
      localhost:4567/add - adding contact info form
      localhost:4567/view - view all added contacts
      localhost:4567/phonebook - phonebook (expiremental)
      localhost:4567/about - team and project informations

##Team Members

      Wave Cantery Ambray
      Athena Llouesse Abella
      Lemerson Jan Cutab
      Jefford Andoy
      xxxxx xxxx xxxx
      
 
      
