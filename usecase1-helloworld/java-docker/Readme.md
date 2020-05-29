## Build custom ubuntu image with jdk8

#### 1. Building an image
docker build -t <image-name> <directory path for Dockerfile> <br/>
docker build -t my-ubuntu .

#### 2. Listing of all images
docker images

#### 3. Running a container from image built above
docker run -itd --name <container-name> <imageId or image name with tag> <br>
docker run -itd --name my-ubuntu-container  my-ubuntu:latest

#### 4. View all running containers
docker ps

#### 5. View all containers running and stopped
docker ps -a

#### 6. Logging into running container
docker exec -it <container-id> /bin/bash

#### 7. View logs of container
docker logs <container-id>

#### 8. Stop running container
docker stop <container-id>

####9. Remove container
docker rm <container-id> <br>

Use -f to forcefully remove container.<br>
Can be used when container is in use and you want to remove it forcefully.<br>
docker rm -f <container-id>

####10. Remove image
docker image rm <image-name-with-tage OR image-id> <br>
docker image rm my-ubuntu:latest
