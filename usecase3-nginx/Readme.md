#### 1. Building an image
docker build -t &lt;image-name&gt; &lt;directory path for Dockerfile&gt; <br/>
docker build -t my-nginx .

#### 2. Listing of all images
docker images

#### 3. Running a container from image built above
docker run -itd --name &lt;container-name> -p 7777:80 &lt;imageId or image name with tag> <br>
docker run -itd --name my-nginx-container -p 7777:80 my-nginx:latest

#### 4. View all running containers
docker ps

#### 5. View all containers running and stopped
docker ps -a

#### 6. Logging into running container
docker exec -it &lt;container-id> /bin/bash

#### 7. View logs of container
docker logs &lt;container-id>

#### 8. Login into docker hub and push images to repository
docker login
docker tag &lt;current-image>:&lt;tag> &lt;repository-name>/&lt;image-name>:&lt;tag> <br>
docker push &lt;repository-name>/&lt;image-name>:<tag>

#### 9. Stop running container
docker stop &lt;container-id>

#### 10. Remove container
docker rm &lt;container-id> <br>

Use -f to forcefully remove container.<br>
Can be used when container is in use and you want to remove it forcefully.<br>
docker rm -f &lt;container-id>

#### 11. Remove image
docker image rm &lt;image-name-with-tage OR image-id> <br>
docker image rm my-nginx:latest 

#### 12. Pull image from docker hub
docker pull &lt;repository-name>/&lt;image-name>:&lt;tag>
