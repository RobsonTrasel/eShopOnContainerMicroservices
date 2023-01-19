# E-Shopping Commerce

This project is an example of how to build an e-commerce using microservices-based architecture, scalability, Event-Driven Architecture (EDA), Command-Query Responsibility Segregation (CQRS) and Java with Spring and Spring Boot.

The project is divided into several microservices, each responsible for a specific functionality, such as product management, shopping cart, payments, etc. This allows you to scale the system as needed.

EDA is used to synchronize the microservices and ensure that all data is always up-to-date. Each microservice is responsible for a specific task, such as querying or modifying data, which helps keep the architecture clean and easy to maintain.

Microservices are packaged in containers, which makes deployment and management easier. Java, Spring, and Spring Boot are used to develop the microservices, providing robust capabilities to create scalable, high-performance web applications.

The project aims to be an example and base for development of other e-commerce projects, but it is important to remember that before using it in a production environment, it is necessary to follow good security practices and protect sensitive information.


## Features

- Product management: a microservice responsible for managing the products available for sale in the e-commerce, including adding, editing and deleting products.

- Shopping cart: a microservice responsible for managing the items added to the shopping cart by users, including adding, editing and deleting items.

- Payments: a microservice responsible for processing payments, including support for various payment methods, such as credit card, debit card, bank transfer, and boleto.

- Authentication and authorization: a microservice responsible for managing user authentication and authorization, including registration, login, and permissions management.

- Monitoring and management: a microservice responsible for collecting metrics and providing an interface to manage and monitor the state of microservices.

- Order management: a microservice responsible for managing orders, including processing, tracking, and delivery.

- Inventory management: a microservice responsible for managing the inventory of products, including updating the inventory when a product is added to the shopping cart or an order is processed.

- Product Recommendation: a microservice responsible for providing product recommendations based on the user's purchase history and shopping behavior data.
## Contributing

Contributions are always welcome!

See `contributing.md` for how to get started.

Please follow the `code of conduct' for this project.


## Feedback

If you have any feedback, please let us know at robson.trasel@gmail.com


## License

[MIT](https://choosealicense.com/licenses/mit/)
