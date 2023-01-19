# API Microservice
This microservice is responsible for providing an application programming interface (API) to the e-commerce system. It is developed using Spring REST and Java, and is designed to be scalable and flexible.

## Features
- Product management: The microservice provides capabilities to create, read, update, and delete products in the e-commerce system.
- Order Management: The microservice provides capabilities to create, read, update, and delete orders in the e-commerce system.
- User management: The microservice provides capabilities to create, read, update, and delete users in the e-commerce system.
- Authentication and Authorization: The microservice provides capabilities to authenticate and authorize users to access protected resources.

## Architecture
The microservice API uses the microservices architecture, where each functionality is implemented as an independent service. This allows the system to be scalable and flexible, allowing new features to be added or removed without affecting the operation of the system.

## How to contribute
This project is open-source and anyone interested in contributing is welcome. To contribute, you can:

- Report bugs or request new features through the GitHub issue tracking system.
- Submit pull requests to fix bugs or add new features.
When contributing, please keep in mind the code style guidelines and the project's contribution guidelines.

## License
This project is licensed under the MIT license. See the License file for more information.

## How to use
To use this microservice, you will need to follow these steps:

- Clone the GitHub repository.
- Set the database connection properties in the application.properties file.
- Build and run the project using the ./mvnw clean install command
Access the API via the URL http://localhost:8080/api.
- It is important to note that this microservice depends on other microservices to work properly. Make sure the other microservices are also running before using this microservice.

## API Documentation
The API documentation is available at the following address shortly. It describes the available features and how to use them.