# Download first httpd base image.
FROM httpd:latest

# Author of the Docker File
LABEL "Maintainer"="Suresh"

# Copy the sample-website directory
COPY sample-website /usr/local/apache2/htdocs/sample-website

# Override default httpd.conf file.
COPY httpd.conf /usr/local/apache2/conf
