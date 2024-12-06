# ERP Entity Management API (Java)

## Description
As part of the ERP demo application, this project provides API endpoints for entity management operations on commonly used objects. For example, 

* Tanks
* Operation codes 
* Ingredients

Write operations on these types of objects typically are typically not performed by the average end user, but by a user with an adminitrative role.

## Building the application

Note: This project has a build dependency on the Apache Maven (https://maven.apache.org/) build tool, which must be installed and on your system path.

This project relies on the 'erp-core' maven module, which needs to be built first, using the following command from the erp-core project.

`mvn install`

And then the following command will build the executable jar, which must be build within this project's directory.
`mvn package`


## Starting the application
Locally, the application may be ran via the command
	mvn spring-boot:run
	
For other environments, the application should be deployed as a Docker image as follows.

mvn spring-boot:build-image
docker run -p 8080:8080 native-test:0.0.1-SNAPSHOT


## Enhancment log
8/8/2024
	Initial project setup w/w single API (Tank)
	Configured GitHub action for CI deployment to server
	
## Additional information 
For information details on the purpose of the project and details of the problem domain we are working with here, you can visit [https://www.matthewdalby.com]()