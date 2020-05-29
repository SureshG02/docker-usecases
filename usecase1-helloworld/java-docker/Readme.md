## Build custom ubuntu image with jdk8

#### 1. Building an image
docker build -t &lt;image-name&gt; &lt;directory path for Dockerfile&gt; <br/>
docker build -t my-ubuntu .

#### 2. Listing of all images
docker images

#### 3. Running a container from image built above
docker run -itd --name &lt;container-name&gt; &lt;imageId or image name with tag&gt; <br>
docker run -itd --name my-ubuntu-container  my-ubuntu:latest

#### 4. View all running containers
docker ps

#### 5. View all containers running and stopped
docker ps -a

#### 6. Logging into running container
docker exec -it &lt;container-id&gt; /bin/bash

#### 7. View logs of container
docker logs &lt;container-id&gt;

#### 8. Stop running container
docker stop &lt;container-id&gt;

####9. Remove container
docker rm &lt;container-id&gt; <br>

Use -f to forcefully remove container.<br>
Can be used when container is in use and you want to remove it forcefully.<br>
docker rm -f &lt;container-id&gt;

####10. Remove image
docker image rm &lt;image-name-with-tage OR image-id&gt; <br>
docker image rm my-ubuntu:latest
