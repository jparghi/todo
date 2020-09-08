# Todo Application

## Prerequisites

Install & Configure Java,Maven,git 

## Technologies used

Spring boot, Java, Rest

## Install & Run application 

> git clone https://github.com/jparghi/Todo.git

> cd Todo

> mvn clean install

> mvn spring-boot:run



## Requirement 

Create TODO app which can has 

User interface for  configuring todo list, showing reports, configuring alerts along with the todo 

## Microservices

Portal - Microservice - User interface - configuring todo list, showing reports, configuring alerts along with the todo 

Rest controller Microservice -  gets the user data and saves the data to the database 

Reports Microservice  - pulls reports from database regarding successful and failed attemps of todo list

Notification microservice - sends reminder as per defined in the todo-alert 

Messaging Microservice - for publishing/subscribing notification events from Kafka message bus. 


## Use cases  & deployment strategies 

usecase 1 - user creates todo list 
usecase 2 - user gets reminder for todo
usecase 3 - user can pull the report for successful / failed todos (PDF) 


## How to deploy the application 

- create the microservice using spring boot 
- create deployment.yaml file in the applcaiton'
- user kubectl apply deployment.yaml to spin the applicaiton (several microservices)
- manage pods using kubernetes
 
 
## Tools and technologies ----

cloud technologies : kubernetes, docker 

CI/CD - git lab source control, creating pipelines 

Creating microservice - Spring boot, hibernate, cassandra, Java

Cloud - GCP , API gateway, IAM, GKE (google kubernetes engine) 

Marketplace app - use mpdev utility to create deploy app as a one click structure. 


## Things to keep in mind

- application scalability - by adding more CPU resources
- database scalability - by spinning up more instances
- Disaster recovery of an applicaiton 
- Enable logging 


