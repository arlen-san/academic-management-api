# 🎓 Academic Management REST API

A robust RESTful API built with Java and Spring Boot to manage academic records. 

This project demonstrates core backend engineering principles, including Object-Relational Mapping (ORM), MVC architecture, and data integrity through validation. It serves as a foundational system for managing student registrations, allowing complete CRUD operations.

## 🚀 Features
* **Complete CRUD:** Create, Read, Update, and Delete student records.
* **Data Validation:** Implements Spring Boot Validation (`@NotBlank`, `@Email`) to ensure data integrity and prevent invalid entries at the controller level.
* **In-Memory Database:** Utilizes H2 Database for seamless testing and development without requiring external database setups.
* **RESTful Best Practices:** Proper use of HTTP methods (GET, POST, PUT, DELETE) and clear endpoint routing.

## 🛠️ Technologies & Stack
* **Java** (JDK 17+)
* **Spring Boot** (Web, Data JPA, Validation)
* **H2 Database**
* **Maven** (Dependency Management)

## 📡 API Endpoints

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/students` | Retrieves a list of all students. |
| `GET` | `/students/{id}` | Retrieves a specific student by ID. |
| `POST` | `/students` | Creates a new student. Requires a valid JSON body. |
| `PUT` | `/students/{id}` | Updates an existing student's data. |
| `DELETE` | `/students/{id}` | Deletes a student from the database. |

## ⚙️ How to Run Locally

1. Clone the repository:
   git clone https://github.com/arlen-san/academic-management-api.git

2. Navigate to the project directory:
   ```bash
   cd academic-management-api
   ```

3. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

4. The API will be available at `http://localhost:8080/students`. You can test the endpoints using Postman or Insomnia.

## 💡 What I Learned
Building this API solidified my understanding of the Spring ecosystem, specifically how Controllers handle incoming HTTP requests, how Repositories abstract SQL queries using Spring Data JPA, and the importance of validating incoming data before it reaches the database layer.
