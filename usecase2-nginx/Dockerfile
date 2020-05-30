# Updated as of Aug 16, 2017
# FROM specified which image i want to download
# Needs to be provided before any other section of code.
FROM nginx:1.14

#Author of the Docker File
# MAINTAINER Pictolearn Note: MAINTAINER has been deprecated for LABEL, 
# LABEL is a key value pair 
LABEL "Maintainer"="Pictolearn"

# Copy httpd.conf with changes to the root directory
COPY default.conf /etc/nginx/conf.d/

# Copy the sample-website1 directory
COPY sample-website1/ /usr/share/nginx/html/sample-website1

# Copy the sample-website2 directory
COPY sample-website2/ /usr/share/nginx/html/sample-website2