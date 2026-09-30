

# 🎓 School Management System

A simple **School Management System** built with **Spring Boot** and **Spring Data JPA**.

This project demonstrates building RESTful APIs, applying validation, handling relationships between entities, and managing data using MySQL.

---

## ✨ Features

- 👨‍🏫 Teacher Management
  - Add a teacher
  - Get all teachers
  - Get teacher details by ID
  - Update teacher information
  - Delete a teacher

- 🏠 Address Management
  - Add an address
  - Get addresses
  - Update an address
  - Delete an address

- 🔗 One-to-One Relationship
  - Each teacher can have one address.
  - The relationship uses `@OneToOne` and `@MapsId`.

- ✅ Data Validation
  - Teacher age must be 23 or older.
  - Salary must be at least 1000.
  - Name and email are required.
  - Address fields are validated.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Jakarta Validation
- Lombok
- Maven
- Postman

---

## 📁 Project Structure

```text
src
└── main
    └── java
        └── com.example.school
            ├── Api
            ├── Controller
            ├── DTO
            ├── Model
            ├── Repository
            └── Service
```

---

## 🔗 API Endpoints

### Teacher

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/Teacher/get` | Get all teachers |
| POST | `/api/v1/Teacher/add` | Add a new teacher |
| PUT | `/api/v1/Teacher/update/{id}` | Update a teacher |
| DELETE | `/api/v1/Teacher/delete/{id}` | Delete a teacher |
| GET | `/api/v1/Teacher/get/details/{id}` | Get teacher details |

### Address

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/address/get` | Get all addresses |
| POST | `/api/v1/address/add` | Add a new address |
| PUT | `/api/v1/address/update` | Update an address |
| DELETE | `/api/v1/address/delete/{id}` | Delete an address |

---

## 🗄️ Database

The project uses **MySQL** as the database and **JPA/Hibernate** for persistence.

The main entities are:

- `Teacher`
- `Address`

They are connected through a **One-to-One relationship**.

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Configure the database

Update your `application.properties` with your MySQL configuration.

### 3. Run the application

Run the Spring Boot application from IntelliJ IDEA or using Maven:

```bash
./mvnw spring-boot:run
```

The application will run on:

```text
http://localhost:8080
```

---

## 💡 Purpose

This project was created as a practical exercise to apply **Spring Boot, REST APIs, JPA relationships, validation, and CRUD operations** in a real-world style project.

---

### 🌱 Built with curiosity, practice, and a little bit of coffee ☕
```
