# EcommerceProject

Welcome to **EcommerceProject** — a full stack e-commerce application built using Spring Boot, React, and MySQL. This project aims to provide a modern, scalable, and robust foundation for an online store, combining a Java-based backend with a dynamic React frontend and a reliable MySQL database.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## Features

- User authentication and authorization
- Product catalog management
- Shopping cart functionality
- Order processing
- RESTful API with Spring Boot
- Responsive UI built with React

## Tech Stack

- **Backend:** Spring Boot (Java)
- **Frontend:** React (JavaScript)
- **Database:** MySQL

## Project Structure

- **Main backend code:** [`ecom-backend/src/main/java/com/pranay/ecom_backend`](ecom-backend/src/main/java/com/pranay/ecom_backend)
    - Contains all backend source code (controllers, services, models, repositories).

## Getting Started

### Prerequisites
- Java (JDK 17+ recommended)
- Node.js & npm
- MySQL Server

### Backend Setup (Spring Boot)
1. Clone the repository:
    ```bash
    git clone https://github.com/pranaypanakanti/EcommerceProject.git
    cd EcommerceProject
    ```
2. Configure your `application.properties` with your MySQL credentials.
3. Build and run the backend:
    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend Setup (React)
1. Navigate to the frontend directory (if separated).
2. Install dependencies:
    ```bash
    npm install
    ```
3. Start the React development server:
    ```bash
    npm start
    ```

### Database Setup
- Create a MySQL database and update your backend configuration accordingly. The app will auto-generate required tables on startup.

## Usage

- Access the frontend via [http://localhost:3000](http://localhost:3000)
- Backend runs on [http://localhost:8080](http://localhost:8080)
- Register, login, browse products, add items to cart, and place orders!

## Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/pranaypanakanti/EcommerceProject/issues).

## License

This project is currently unlicensed.

## Author

Made withby [PranayPanakanti](https://github.com/pranaypanakanti)

---
