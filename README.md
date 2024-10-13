# Spring Boot JDBC Template Application

This Spring Boot application demonstrates how to use Spring's `JdbcTemplate` to interact with a relational database to perform basic CRUD (Create, Read, Update, Delete) operations on an `Employee` entity.

# Features

- **CRUD Operations**: Create, Read, Update, Delete employee records in the database using `JdbcTemplate`.
- **Patch Update**: Supports partial updates (patching) for employee data, such as updating only the employee's salary.
- **Database Interaction**: Utilizes Spring's `JdbcTemplate` to run SQL queries against the database.
- **Error Handling**: Ensures SQL exceptions are managed properly.

# Technologies Used

- Spring Boot 3.x
- Spring JDBC (JdbcTemplate)
- Maven
- Java 17+

# Prerequisites

- Java 17 or higher
- Maven 3.x
- A relational database (e.g., MySQL, PostgreSQL) configured and running

# Getting Started

# Clone the repository

```bash
https://github.com/Prathamesh-Jagtap/SpringBoot-JdbcTemplate.git
cd spring-boot-jdbctemplate-app
```

# Build and Run the Project
```bash
mvn clean install
mvn spring-boot:run
```
