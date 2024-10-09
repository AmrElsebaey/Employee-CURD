# Employee Management System (CRUD)

## Overview

This project is a web-based application designed for managing employee records. It provides an intuitive interface for performing Create, Read, Update, and Delete (CRUD) operations on employee data. The project uses **Spring Boot** as the backend framework, **Thymeleaf** as the front-end template engine, and **Spring Data JPA** for database interaction.

## Features

1. **View All Employees**: Displays a list of all employees stored in the database.
2. **Add New Employee**: A form for adding a new employee with details such as name, email.
3. **Update Employee Information**: Edit and update existing employee details.
4. **Delete Employee**: Delete an employee from the system with confirmation.
   
## Technologies Used

- **Spring Boot**: Framework for building Java-based web applications.
- **Thymeleaf**: Server-side template engine for rendering dynamic HTML pages.
- **Spring Data JPA (Hibernate)**: ORM framework for managing database operations.
- **MySQL**: for storing employee data.
- **Maven**: Build automation and dependency management.

## Database Design

The database consists of a single `Employee` table with the following fields:
- `id`: Unique identifier for each employee.
- `first_name`: First name of the employee.
- `last_name`: Last name of the employee.
- `email`: Contact email.


