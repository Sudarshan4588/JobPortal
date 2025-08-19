Job Portal Application

A Spring Boot-based Job Portal Application that enables users to manage job postings with full CRUD functionality.
The application leverages Spring Data JPA for database operations, PostgreSQL as the database, and REST APIs for interaction.
All APIs were tested and validated using Postman.

🚀 Features

Create, Read, Update, and Delete (CRUD) job postings.

RESTful APIs for job management.

Optimized database interactions with Spring Data JPA.

Postman-tested APIs for reliability and correctness.

Built with modular, scalable Spring Boot architecture.

🛠️ Tech Stack

Backend Framework: Spring Boot

Database: PostgreSQL

ORM: Spring Data JPA

Security: Spring Security

API Testing: Postman

Build Tool: Maven

🔑 Security Configuration

The application uses Spring Security with in-memory authentication.

/jobPosts → Accessible to everyone (no login required).

/jobPosts/* → Only accessible by users with ADMIN role (CRUD allowed).

Other endpoints → Require authentication.

In-Memory Users:

admin / admin123 → Role: ADMIN

user / user123 → Role: USER

📌 API Endpoints
Job Postings
Method	Endpoint	Description
GET	/jobPosts	Get all job postings
GET	/jobPosts/{id}	Get job by ID
POST	/jobPosts	Create a new job posting
PUT	/jobPosts/{id}	Update job posting
DELETE	/jobPosts/{id}	Delete job posting
⚙️ Setup & Installation
Prerequisites

Install Java 17+

Install Maven

Install PostgreSQL

Steps

Clone the repository:

git clone https://https://github.com/Sudarshan4588/JobPortal.git
cd JobPortal


Configure PostgreSQL:

Create a database:

CREATE DATABASE job_portal;


Update application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/job_portal
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Build & Run the Application:

mvn spring-boot:run



<img width="971" height="721" alt="image" src="https://github.com/user-attachments/assets/3a160fc4-b84b-4911-b555-e895eb76bd19" />
