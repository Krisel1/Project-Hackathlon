## U-Breathe Project
The U-Breathe Project allows users with respiratory difficulties to check the pollution levels in the available locations on the map, currently in the capitals of Catalonia, with the intention of scaling up to include all of Spain and, in the future, new countries. It provides recommendations on how to act according to pollution levels.

### DiseasesApplication
DiseasesApplication is an application designed to manage information about diseases through a REST API. It allows performing Create, Read, Update, and Delete (CRUD) operations on disease records. This application is built using Spring Boot for the backend and several key dependencies.

## Table of Contents

- [Implemented Technologies](#implemented-technologies)
- [Main Features](#main-features)
- [Available Endpoints](#available-endpoints)
- [Frontend Connection](#frontend-connection)


### Implemented Technologies

- Java: For developing the core application.
- MySQL: For the database.
- Spring Framework: For implementing MVC architecture, Dependency Injection, and other enterprise-level features.
- Spring Data JPA: For abstracting the persistence layer.
- Hibernate: For Object-Relational Mapping (ORM) with the MySQL database.
- Maven: For project build and dependency management.
- JUnit: For testing the application components.
- Lombok: To reduce boilerplate code.
- Spring Web: For creating RESTful web services.

### Main Features

- Complete CRUD: Create, read, update, and delete disease records.
- RESTful API: Implementation of REST endpoints to interact with disease data.
- Persistence: Utilization of MySQL and Spring Data JPA for data management.
- Unit Testing: Use of JUnit to ensure code quality.
- Rapid Development: Use of Lombok to minimize repetitive code and improve productivity.

### Available Endpoints

- GET /diseases: Retrieves the list of all diseases.
- GET /diseases/{id}: Retrieves a specific disease by its ID.
- POST /diseases: Creates a new disease.
- PUT /diseases/{id}: Updates an existing disease.
- DELETE /diseases/{id}: Deletes a disease by its ID.

### Frontend Connection
To connect with the frontend, methods are implemented to consume the endpoints and efficiently manage the disease information. Ensure the frontend is configured to interact with these REST endpoints.