#### New Project Detected: Spring Boot CRUD Application with One-to-One Bidirectional Mapping #####


Let's build a one-to-one bidirectional CRUD application in Spring Boot, ensuring the following:

a) DTO Objects for separation of entity and data transfer logic.
b) Manual Mapping between entities and DTOs.
C) Global Exception Handling for consistent error responses.
d) Logging in controllers and services.
e) MySQL Database for persistent storage.



Step 1: High-Level Plan

Define Requirements:
a) Create two entities with a one-to-one bidirectional relationship (e.g., User and Profile).
b) Use DTOs to encapsulate data and map them manually in services.
C) Implement CRUD operations with proper exception handling and logging.
d) Connect to a MySQL database.

Create Components:

a) Entities: Define User and Profile with bidirectional mappings.
b) DTOs: Create UserDTO and ProfileDTO.
C) Repositories: Use Spring Data JPA for database operations.
d) Services: Write services for CRUD operations, include manual mapping and logging.
e) Controllers: Expose REST APIs for CRUD functionality.
f) Exception Handling: Add a global exception handler using @ControllerAdvice.
g) Logging: Add logging with SLF4J at key points.

Technologies Used:

a) Spring Boot (REST, JPA, Validation, SLF4J)
b) MySQL (Database)
C) Maven (Build Tool)
d) Lombok (Reduce boilerplate code)


Step 2: Directory Structure

src/main/java/com/example/bidirectionalcrud/
├── controller/
│   ├── UserController.java
├── dto/
│   ├── UserDTO.java
│   ├── ProfileDTO.java
├── entity/
│   ├── User.java
│   ├── Profile.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   ├── ResourceNotFoundException.java
├── repository/
│   ├── UserRepository.java
│   ├── ProfileRepository.java
├── service/
│   ├── UserService.java
│   ├── ProfileService.java
├── mapper/
│   ├── UserMapper.java
├── BidirectionalCrudApplication.java
