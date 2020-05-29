# Install FROM UBUNTU IMAGE
FROM ubuntu:16.04

#Author of the Docker File
LABEL "Maintainer"="Suresh"

# RUN COMMAND BASICALLY runs the command in the terminal and creates an image.
# Install all the updates for UBUNTU
RUN apt-get update && apt-get upgrade -y

# Adds the repository where JDK 8 can be obtained for UBUNTU
RUN apt-get install -y software-properties-common
RUN add-apt-repository ppa:webupd8team/java -y

# INSTALL THE VI EDITOR
RUN apt-get install -y vim

#INSTALL ALL the updates again and install MAVEN and JDK 8
RUN apt-get update && apt-get install -y default-jdk maven

# ADD a directory called docker-git-hello-world inside the UBUNTU IMAGE where you will be moving all of these files under this
# DIRECTORY to
ADD . /usr/local/java-docker

# Go to project directory and Maven assembly will package the project into a JAR FILE which can be executed
RUN cd /usr/local/java-docker && mvn assembly:assembly

#THE CMD COMMAND tells docker the command to run when the container is started up from the image. In this case we are
# executing the java program as is to print Hello World.
CMD ["java", "-cp", "/usr/local/java-docker/target/java-docker-1.0-SNAPSHOT-jar-with-dependencies.jar", "com.demo.HelloWorld"]