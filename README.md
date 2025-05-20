# User Manager

User Manager is a comprehensive system for user account management, enabling easy creation, editing, deletion, and display of user accounts in a database. The application leverages modern web technologies to create an intuitive user interface, providing a simple way to manage user authentication and profiles.

## 🚀 Features

### 📝 User Management
- **Add Users**: Intuitive form for creating new user accounts
- **Edit Users**: Ability to update information about existing users
- **Delete Users**: Easy removal of unnecessary user accounts
- **Browse Users**: Clear view of all users in the system with status information

### 👤 User Information
- **First Name**: User's first name
- **Last Name**: User's last name
- **Email**: Unique email address for identification and communication
- **Password**: Secure password storage
- **Enabled Status**: Ability to enable or disable user accounts

## 🛠 Technologies

- **Backend**: Java with Spring Boot framework
- **Data Layer**: Spring Data JPA
- **Database**: Relational database with users table
- **Frontend**: Thymeleaf templates
- **Architecture**: Model-View-Controller (MVC)

## 🗂 Project Structure

### Main Components
- **Model**:
    - `User.java` - entity representing a user account in the database

- **Repository**:
    - `UserRepository.java` - interface for database operations with custom count method

- **Service**:
    - `UserService.java` - business logic for user management including CRUD operations
    - `UserNotFoundException.java` - custom exception for user lookup errors

- **Controller**:
    - `MainController.java` - handles home page requests
    - `UserController.java` - handles all user-related HTTP requests and manages views

## 📱 User Interface

The application contains several main views:
- Home page with application overview
- Users list page showing all accounts
- User form for creating and editing user profiles
- Flash messages for operation status feedback

## 🔧 Database Configuration

The application is configured to work with a relational database:
- Table: `users`
- Fields: id, first_name, last_name, email, password, enabled
- Constraints: Unique email addresses, non-nullable fields
- Entity mapping: JPA annotations for object-relational mapping

## 🚀 Deployment

To run the application:
1. Ensure you have Java installed and a database configured
2. Create the database with a `users` table
3. Adjust the connection settings in `application.properties` if necessary
4. Run the application using Spring Boot

## 🔐 Security

- Secure user data storage in relational database
- Password field for authentication (can be extended with encryption)
- Account enable/disable functionality
- Input validation with error handling
- Flash messages for user feedback
- Custom exception handling for better user experience

---

User Manager represents a modern approach to user profile management, offering a clean, efficient interface built on reliable Spring Boot technology. The system provides a comprehensive solution for applications requiring user authentication and profile management.
