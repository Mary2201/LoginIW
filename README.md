# LoginIW
# Spring Boot & React Login CRUD Application

## Description
This project is a simple login system built with Spring Boot and React, featuring:
- User registration
- User login
- Protected CRUD functionality (available only after authentication)

## Features
- User Authentication (username and password)
- BCrypt password hashing
- JWT-based session management (if applicable)
- RESTful API for user operations

## Technologies Used
- **Backend**: Spring Boot, Spring Security, JPA, MySQL
- **Frontend**: React, Axios
- **Database**: MySQL

## Setup Instructions

### Backend
1. Clone the repository
2. Set up MySQL database and update `application.properties`
3. Run the backend service:
   ```bash
   ./mvnw spring-boot:run
