# **Learning Management System (LMS)**  

## **📌 Project Overview**  
The **Learning Management System (LMS)** is a backend application built using **Spring Boot** and **MySQL**. It provides functionalities such as **CRUD operations**, **user authentication**, and **role-based access control** using **JWT tokens**. This project follows **Object-Oriented Programming (OOP) principles** and a structured approach for backend development.  

---

## **🛠️ Technologies Used**  
- **Backend:** Java, Spring Boot  
- **Database:** MySQL, JPA (Hibernate)  
- **Security:** Spring Security, JWT Authentication  
- **Build Tool:** Maven  
- **Testing:** Postman (for API testing)  

---

## **📂 Project Structure**  
The project follows a **layered architecture**:  


---

## **🚀 Key Features & Functionalities**  

### **✅ User Roles & Authentication**  
The LMS has three main user roles:  

| **Role**        | **Capabilities** |
|----------------|----------------|
| **Admin** | Create/Delete Users, Add/Remove Courses, Assign Instructors |
| **Instructor** | Manage Courses, Create/Update Lessons, View Enrolled Students |
| **Student** | Enroll in Courses, View Lessons, Download Course Materials |

#### **🔒 Authentication & Authorization**  
- Users log in using a **username and password**.  
- A **JWT token** is generated upon successful login.  
- **Role-based access control** restricts unauthorized access.  

---

### **📝 REST API Endpoints**  
The following APIs are implemented for managing users and courses:  

#### **👤 User Management APIs**  
| **Method** | **Endpoint** | **Description** |
|-----------|-------------|-----------------|
| **POST** | `/auth/register` | Register a new user |
| **POST** | `/auth/login` | Authenticate user and generate JWT |
| **GET** | `/users/{id}` | Get user details by ID |
| **PUT** | `/users/{id}` | Update user information |
| **DELETE** | `/users/{id}` | Delete a user |

#### **📚 Course Management APIs**  
| **Method** | **Endpoint** | **Description** |
|-----------|-------------|-----------------|
| **POST** | `/courses` | Create a new course |
| **GET** | `/courses` | Get list of all courses |
| **GET** | `/courses/{id}` | Get details of a specific course |
| **PUT** | `/courses/{id}` | Update course details |
| **DELETE** | `/courses/{id}` | Delete a course |

---

## **💾 Database Configuration**  
The application uses **MySQL** as the database.  

### **🔧 Steps to Set Up MySQL:**  
1. **Install MySQL** (if not already installed).  
2. **Create a database**:  
   ```sql
   CREATE DATABASE lms_db;
3. **Update application.properties file:**
   - spring.datasource.url=jdbc:mysql://localhost:3306/lms_db
   - spring.datasource.username=root
   - spring.datasource.password=your_mysql_password
   - spring.jpa.hibernate.ddl-auto=update
   - spring.jpa.show-sql=true
