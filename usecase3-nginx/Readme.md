####1. Building an image
docker build -t <image-name> <directory path for Dockerfile> <br/>
docker build -t my-nginx .

####2. Listing of all images
docker images

####3. Running a container from image built above
docker run -itd --name <container-name> -p 7777:80 <imageId or image name with tag> <br>
docker run -itd --name my-nginx-container -p 7777:80 my-nginx:latest

####4. View all running containers
docker ps

####5. View all containers running and stopped
docker ps -a

####6. Logging into running container
docker exec -it <container-id> /bin/bash

####7. View logs of container
docker logs <container-id>

####8. Login into docker hub and push images to repository
docker login
docker tag <current-image>:<tag> <repository-name>/<image-name>:<tag> <br>
docker push <repository-name>/<image-name>:<tag>

####9. Stop running container
docker stop <container-id>

####10. Remove container
docker rm <container-id> <br>

Use -f to forcefully remove container.<br>
Can be used when container is in use and you want to remove it forcefully.<br>
docker rm -f <container-id>

####11. Remove image
docker image rm <image-name-with-tage OR image-id> <br>
docker image rm my-nginx:latest 

####12. Pull image from docker hub
docker pull <repository-name>/<image-name>:<tag>
