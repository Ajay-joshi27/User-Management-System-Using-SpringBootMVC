# Spring Boot User Management System

A web-based User Management System developed using **Java, Spring Boot, Spring Data JPA, Hibernate, Thymeleaf, Bootstrap 5 and MySQL**.

This project demonstrates how to build a server-side web application following the layered architecture of Spring Boot. It allows users to register, view, update and delete user records through a responsive web interface.

## 🚀 Features

- **User Registration:** Add new users with first name, last name and email address.
- **View All Users:** Display all registered users from the MySQL database.
- **Update User:** Retrieve existing user details and update their information.
- **Delete User:** Delete a particular user using their unique ID.
- **Thymeleaf Integration:** Dynamically render HTML pages and bind form data.
- **Responsive UI:** Bootstrap 5 styling for a clean and user-friendly interface.
- **Database Integration:** Store and manage user information using MySQL and Spring Data JPA.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Application development |
| Spring MVC | Request handling and controller logic |
| Spring Data JPA | Database operations |
| Hibernate | ORM framework |
| MySQL | Relational database |
| Thymeleaf | Server-side HTML rendering |
| Bootstrap 5 | Frontend styling |
| Maven | Dependency management |
| Eclipse IDE | Development environment |

## 🏗️ Project Architecture

The application follows a layered architecture:

```text
                 Browser
                    |
                    v
              Thymeleaf UI
                    |
                    v
              UserController
                    |
                    v
               UserService
                    |
                    v
                UserRepo
                    |
                    v
                IUserRepo
                    |
                    v
                 Hibernate
                    |
                    v
                  MySQL
```

### Layer Responsibilities

**1. Controller Layer**
- Handles incoming HTTP requests.
- Accepts form submissions.
- Sends data to the service layer.
- Returns Thymeleaf views.

**2. Service Layer**
- Contains business logic.
- Coordinates operations between controller and repository.

**3. Repository Layer**
- Performs CRUD operations.
- Communicates with the database using Spring Data JPA.

**4. Entity Layer**
- Represents the User database table.
- Contains user properties such as ID, first name, last name and email.

## 📂 Project Structure

```text
SpringMvcCrudProject/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ajay/
│   │   │       ├── Controller/
│   │   │       │   └── UserController.java
│   │   │       │
│   │   │       ├── Entity/
│   │   │       │   └── User.java
│   │   │       │
│   │   │       ├── Repo/
│   │   │       │   └── UserRepo.java
│   │   │       │
│   │   │       ├── Service/
│   │   │       │   ├── IUserService.java
│   │   │       │   └── UserService.java
│   │   │       │
│   │   │       └── SpringMvcCrudProject1Application.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── users.html
│   │       │   ├── register.html
│   │       │   └── edit.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

*Package and class names in this structure are illustrative; adjust them if your actual project uses different names.*

## 🗄️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE ajay;
```

Configure your `application.properties` file:

```properties
spring.application.name=SpringMvcCrudProject

spring.datasource.url=jdbc:mysql://localhost:3306/ajay
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Update the database username and password according to your local MySQL configuration.

## ⚙️ How to Run the Project

### Prerequisites

- Java JDK 17 or compatible version for your Spring Boot release
- Maven
- MySQL Server
- Eclipse IDE or IntelliJ IDEA

### Step 1: Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### Step 2: Open the Project

Import the project into Eclipse or IntelliJ IDEA as an existing Maven project.

### Step 3: Configure MySQL

Create the `ajay` database and configure the database credentials in `application.properties`.

### Step 4: Build the Project

```bash
mvn clean install
```

### Step 5: Run the Application

Run the main Spring Boot application class or execute:

```bash
mvn spring-boot:run
```

### Step 6: Open the Application

Visit:

```text
http://localhost:8080/user/all
```

## 🌐 Application Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/user/register` | Display registration form |
| POST | `/user/save` | Register a new user |
| GET | `/user/all` | Display all users |
| POST | `/user/edit` | Fetch a user for editing |
| POST | `/user/update` | Update user details |
| POST | `/user/delete` | Delete a user |

The edit and delete forms submit the selected user ID using hidden HTML form fields.

## 📸 Application Screenshots

Add your application screenshots here after capturing them.

Suggested screenshots:

1. User Registration Page
2. Registered Users Dashboard
3. Update User Page
4. MySQL User Records

Example:

```markdown
![User Dashboard](screenshots/user-dashboard.png)

![Registration Page](screenshots/register-page.png)

![Update User](screenshots/edit-user.png)
```

## 🎯 Learning Outcomes

Through this project, I practiced:

- Building MVC-based web applications using Spring Boot.
- Implementing CRUD operations using Spring Data JPA.
- Understanding Controller, Service and Repository layers.
- Integrating MySQL with Hibernate.
- Using Thymeleaf expressions and form binding.
- Passing data between controllers and HTML templates.
- Using hidden form fields to submit user IDs.
- Designing responsive web pages using Bootstrap 5.
- Managing application dependencies using Maven.

## 🔮 Future Enhancements

- Implement form validation using Jakarta Bean Validation.
- Add global exception handling.
- Implement Spring Security authentication and authorization.
- Add user search and pagination.
- Create REST APIs for user management.
- Add unit and integration testing.

## 👨‍💻 Author

**Ajay Joshi**

Java Backend Development Learner

Technologies: Java | Spring Boot | Hibernate | Spring Data JPA | MySQL | Thymeleaf

---

⭐ If you find this project useful, feel free to explore the code and suggest improvements.