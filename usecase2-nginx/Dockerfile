# Download nginx base image.
FROM nginx:1.14

#Author of the Docker File
LABEL "Maintainer"="Suresh"

# Copy httpd.conf with changes to the root directory
COPY default.conf /etc/nginx/conf.d/

# Copy the sample-website1 directory
COPY sample-website1/ /usr/share/nginx/html/sample-website1

# Copy the sample-website2 directory
COPY sample-website2/ /usr/share/nginx/html/sample-website2
