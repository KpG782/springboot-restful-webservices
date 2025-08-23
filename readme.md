# Spring Boot RESTful Web Services

This project is a simple RESTful API built with Spring Boot. It demonstrates how to create, read, update, and delete resources using standard HTTP methods.

## Features

- CRUD operations for resources (e.g., users, posts)
- Standard RESTful endpoints
- JSON request and response bodies
- Exception handling

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Running the Application

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd springboot-restful-webservices
   ```
3. Build and run the application:
   ```
   mvn spring-boot:run
   ```
   The API will be available at `http://localhost:8080`.

## API Endpoints

Below are some example endpoints. Replace `{id}` with the actual resource ID.

### Users

- **Get all users**

  ```
  GET /users
  ```

- **Get user by ID**

  ```
  GET /users/{id}
  ```

- **Create a new user**

  ```
  POST /users
  Content-Type: application/json

  {
    "name": "John Doe",
    "email": "john@example.com"
  }
  ```

- **Update a user**

  ```
  PUT /users/{id}
  Content-Type: application/json

  {
    "name": "Jane Doe",
    "email": "jane@example.com"
  }
  ```

- **Delete a user**
  ```
  DELETE /users/{id}
  ```

## Error Handling

- Returns appropriate HTTP status codes (e.g., 404 for not found, 400 for bad request).
- Error responses are in JSON format.

## License

This project is licensed under the MIT License.
