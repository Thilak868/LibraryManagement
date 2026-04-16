📚 Library Management System (Spring Boot)
A robust backend application built using Spring Boot that manages core library 
operations such as books, authors, and users. The system exposes RESTful APIs for 
seamless interaction and follows a layered architecture to ensure scalability and 
maintainability.

Key Features:
📖 Manage books and authors (CRUD operations)
👤 User management system
🔄 Issue and return book functionality
🔍 Search and filter library resources
📊 Persistent storage using MySQL
📑 Interactive API documentation with Swagger UI

The application follows a layered architecture:
Controller Layer → Handles HTTP requests and responses
Service Layer → Contains business logic
Repository Layer → Interacts with the database using Spring Data JPA
Entity Layer → Defines database models
This separation improves code maintainability and scalability.

Tech Stack:-
Backend: Spring Boot
Database: MySQL
ORM: Spring Data JPA / Hibernate
Build Tool: Maven
API Testing: Swagger UI

Project Structure:
/src
 └── main
     ├── java/com/example/libraryproject
     │    ├── Controller
     │    ├── Service
     │    ├── Repository
     │    ├── entity
     │    └── LibraryProjectApplication.java
     └── resources
/test
pom.xml


Designed using industry-standard layered architecture to simulate real-world backend systems
