# messaging-system

This Project Has Two Components as per the Requirement in the Given Assessment.
a. Perfect Cycle Endpoint
b. An Endpoint Sending Message to Different Queues using RabbitMQ (Messaging System)

How to run the Application

Pre-Req: 
1. JDK 11 and Java Runtime
2. Maven Build Tool
3. Docker Application to run docker containers.


Steps:
1. Clone this Project.
2. Ensure Docker is installed on local machine.
3. From the Root of the App, run command "docker-compose up". This should run the RabbitMQ broker App on port 15672 for Http Requests
4. Go to http://localhost:15672/ and enter username : guest and password : guest to log in to Admin Console of Rabbit MQ
5. Now the RabbitMQ is running, from the Root of the Application i..e /MessagingSystem/ type command ./mvnw spring-boot:run to Run the application.
6. Application should be running on http port 8282. This port can be changed from application.properties file.
7. Import the given PostMan Collection into Postman to test the Endpoint: https://www.getpostman.com/collections/6bc259b4d35041c14267
8. This Collection 'Assessmnent' has two endpoints request with Payload and expects the server running on port 8282. Please change if app running on diff port.

Request 1 : Salary Credit Request
a. This endpoing takes a payload and sends two message to two different queues i.e. Salary Credit Queue and Loan Emi Debit Queue.
b. Both these Queues can be seen on RabbitMQ Management Console and thir Messages as well.
c. Both these Queues are attached to Consumers/Listeners which receives the message and prints on the console. 

Request 2: Perfect Cycle Tester: 
a. This endpoint take the payload as the list of integer array.
b. Return the response as a Map of each Array and Status of it's Perfect cycle (As specified in the Mail)



