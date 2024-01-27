
# Project Title

A brief description of what this project does and who it's for


# Installation
Follow these steps to set up and run the project locally.

#### Clone the Repository

```git 
git clone https://github.com/your-username/your-repo.git
```

#### Install Dependencies

Ensure you have Node.js and npm installed on your machine. If not, you can download and install them from `https://nodejs.org/`.

Navigate to the project directory and install the dependencies.
```
cd your-repo
npm install
```

#### Run the Project

Once the dependencies are installed and any necessary configurations are complete, you can run the project.
```
npm start
```
This command will start the project, and you can access it in your web browser at `http://localhost:3000 `(replace with the appropriate URL if applicable).
# Project Directory Structure

The project directory is organized into several key folders, each serving a specific purpose. Below is an overview of the directory structure:
```
├───.github
│ └───workflows
├───apidoc
│ ├───css
│ ├───fonts
│ ├───img
│ ├───locales
│ ├───utils
│ └───vendor
│ └───path-to-regexp
├───sql
└───src
├───controllers
├───exception
│ └───errors
├───helpers
├───interfaces
├───middlewares
├───models
│ ├───mongo
│ └───mysql
├───providers
├───routes
│ ├───public
│ └───secure
└───services
```

```
├───.github
│ └───workflows # GitHub Actions workflows for CI/CD
├───apidoc
│ ├───css # Stylesheets for API documentation
│ ├───fonts # Fonts used in API documentation
│ ├───img # Images for API documentation
│ ├───locales # Localization files for API documentation
│ ├───utils # Utility scripts for API documentation
│ └───vendor
│ └───path-to-regexp # External library for path-to-regexp
├───sql # SQL scripts or database-related files
└───src
├───controllers # Logic to handle HTTP requests
├───exception
│ └───errors # Custom error handling
├───helpers # Utility functions
├───interfaces # TypeScript interface definitions
├───middlewares # Express middleware functions
├───models
│ ├───mongo # MongoDB data models
│ └───mysql # MySQL data models
├───providers # External service providers or configurations
├───routes
│ ├───public # Public API routes
│ └───secure # Secure API routes
└───services # Business logic and interaction with data models
```


#### Overview

- **.github/workflows:** GitHub Actions workflows for CI/CD.
- **apidoc:** Contains assets and utilities for generating API documentation.
- **sql:** SQL scripts or database-related files.
- **src:**
  - **controllers:** Logic to handle HTTP requests.
  - **exception/errors:** Custom error handling.
  - **helpers:** Utility functions.
  - **interfaces:** TypeScript interface definitions.
  - **middlewares:** Express middleware functions.
  - **models/mongo:** MongoDB data models.
  - **models/mysql:** MySQL data models.
  - **providers:** External service providers or configurations.
  - **routes/public:** Public API routes.
  - **routes/secure:** Secure API routes.
  - **services:** Business logic and interaction with data models.

# Configuration

If your project uses environment variables or configuration files, explain how users can set them up.

#### Create a `.env` file
```ruby
touch .env
```
### Add configuration variables to `.env`
```ruby
PORT=3000
DATABASE_URL=mongodb://localhost:27017/your-database
```
# Database Procedures

### `Blog Procedures`

**1. CreatePosts**

- Creates a new blog post.

- **Usage Example:** 
```javascript
CALL CreatePosts('My First Post', 'This is my first post', 'Abhishek Kumar', @pid);
```
**2. GetAllPosts**

- Retrieves all blog posts.

- **Usage Example:** 
```javascript
CALL GetAllPosts();
```
**3. GetPostByPostId**

- Retrieves a specific blog post by postId.

- **Usage Example:** 
```javascript
CALL GetPostByPostId(1);
```
**3. UpdatePostByPostId**

- Updates a blog post by postId.

- **Usage Example:** 
```javascript
CALL UpdatePostByPostId(1, 'Updated Title', 'Updated Description', 'New Author');
```
**4. DeletePostByPostId**

- Deletes a blog post by postId.

- **Usage Example:** 
```javascript
CALL DeletePostByPostId(1);
```
### `User Procedures`

**1. GetAllUsers**

- Retrieves all user records.

**Usage Example:** 
```javascript
CALL GetAllUsers();
```
**2. ValidateAndInsertUser**

- Validates and inserts a new user.

- **Usage Example:** 
```javascript
CALL ValidateAndInsertUser('Abhishek', 'Kumar', 'abhishek.yashyap@gmail.com', '9529745533', '', @id);
```

Include appropriate information on how to call these procedures and what parameters they require. Adjust the examples based on your specific data and use cases.


# Controller

**`PostController` (postController.ts)**

The PostController class handles HTTP requests related to blog posts in your application. It interacts with the PostService to perform business logic and communicates with the client through the ResponseBuilder for consistent responses.

- **Methods:**
    - **`createPost:`** Creates a new blog post.
    - **`getAllPosts:`** Retrieves all blog posts.
    - **`getPostByPostId:`** Retrieves a specific blog post by postId
    - **`updatePostByPostId:`** Updates a blog post by postId.
    -  **`deletePostByPostId:`** Deletes a blog post by postId.

**`UserController` (userController.ts)**

The UserController class handles HTTP requests related to user management in your application. It interacts with the UserService to perform business logic and communicates with the client through the ResponseBuilder for consistent responses.

- **Methods:**
    - **`getAllUsers:`** Retrieves all user records  
    - **`validateAndInsertUser:`** Validates and inserts a new user.


# Exception Handling and Native Event Management

### `/src/exception/error/index.ts`

To handle errors in the application by mapping error names to corresponding HTTP status codes. This module provides a consistent JSON response for different error types, including validation errors, unique index errors, not found errors, authentication errors, and general bad requests.

### `/src/exception/Handler.ts`

This file defines a class (`Handler`) that includes static methods for handling various types of errors and exceptions in the application.

- **`notFoundHandler`:** Handles not found routes, logging information about the request.
- **`clientErrorHandler`:** Handles client errors, logging the error stack.
- **`errorHandler`:** Handles general errors, logging the error stack, and rendering an error page.
- **`logErrors`:** Logs errors.

### `/src/exception/NativeEvents.ts`

This file defines a class (`NativeEvent`) that catches native events related to the Node.js environment, particularly events related to the clustering of processes.

- **`cluster`:** Listens for cluster events, such as the 'listening' event when a worker process is connected.

These files collectively contribute to error handling, logging, and managing native events in the application.
# Helper Modules

### `/src/helpers/index.ts`

The `index.ts` file in the helpers directory serves as an index for the helper modules in your application. It exports the `ResponseBuilder` and `Validator` classes, making them easily accessible for other parts of your codebase.

### `/src/helpers/Response.ts`

The `ResponseBuilder` class in this file is responsible for handling API responses. It abstracts away the logic of constructing HTTP responses, making it easier to create consistent responses across the application.

#### Functionality:

- Initializes a `ResponseBuilder` instance.
- Provides a `build` method that takes a response object (`rs`) and an Express Response object (`res`).
- Constructs an HTTP response based on the provided response object (`rs`), including the HTTP status code, status message, and data.

### `/src/helpers/Validator.ts`

The `Validator` class is designed to create route validators for input validation in your application. It utilizes the `express-validator` library to define validation rules for specific route parameters, query parameters, or request bodies.

#### Functionality:

- Initializes a `Validator` instance with a `ResponseBuilder` for handling validation error responses.
- Provides a `validate` method that returns an array of validation middleware functions using `express-validator`.
- Each middleware function checks specific validation rules for request parameters and uses the `ResponseBuilder` to handle validation errors.
- If validation errors are found, it constructs and sends an appropriate error response; otherwise, it allows the request to proceed to the next middleware.

These helper classes aim to encapsulate common functionalities, making the code modular, reusable, and promoting a consistent approach to handling responses and validating input data in your Express application.
# API Routes Documentation

- The routes are organized into public and secure folders for clear distinction based on access permissions. 
- Each route file defines a router, utilizes a `Validator` for request validation, and calls the appropriate controller methods to handle business logic. 
- The endpoints are structured logically, making it easy to understand their purpose and usage.

## Public Routes

### `Auth.ts`

- This module defines API routes related to user authentication.

#### Routes

- **POST /auth/user:** Endpoint for user authentication.

#### Usage Example

```typescript
POST /auth/user
```
#### Functionality
- Utilizes the `Validator` middleware to validate the incoming request.
- Calls the `authenticate` method of the `UserController` to handle user authentication.
- Sends the response back to the client.

### `Blog.ts`
- This module defines API routes for managing blog posts.

#### Routes
- **POST /api/blog/post:** Endpoint for creating a new blog post.
- **GET /api/blog/posts:** Endpoint for retrieving all blog posts.
- **GET /api/blog/post/:pid:** Endpoint for retrieving a specific blog post by postId.
- **PUT /api/blog/post/:pid:** Endpoint for updating a blog post by postId.
- **DELETE /api/blog/post/:pid:** Endpoint for deleting a blog post by postId.

#### Usage Example

```typescript
POST /api/blog/post
GET /api/blog/posts
GET /api/blog/post/:pid
PUT /api/blog/post/:pid
DELETE /api/blog/post/:pid
```

#### Functionality:

- Utilizes the `Validator` middleware to validate the incoming request for certain routes.
- Calls the corresponding methods of the `PostController` to handle blog post creation, retrieval, updating, and deletion.
- Sends the response back to the client.

## Secure Routes

### `user.ts (Placeholder)`
 This module is a placeholder for defining additional secure routes. As it stands, it does not have any specific routes or functionality.
# Service Classes Documentation

- **Service Classes:** The service classes (`PostService` and `UserService`) are designed to handle the business logic for managing blog posts and users, respectively.

- **Model Interaction:** Each service class interacts with its corresponding data model (`PostModel` for `PostService` and `UserModel` for `UserService`), which is expected to handle the actual database operations.

- **Error Handling:** The code includes error logging to the console, but in a production environment, you may want to enhance error handling, possibly by throwing custom exceptions or using a dedicated error-handling mechanism.

- **Asynchronous Operations:** The service methods utilize asynchronous operations with async/await, indicating that they may involve I/O operations such as database queries.

- These service classes abstract away the data access layer and provide a clean interface for your controllers to interact with the underlying models, promoting modularity and separation of concerns in your application.


## `PostService (PostService.ts)`

The `PostService` class encapsulates the business logic related to handling blog posts in your application.

### Functionality

- **Constructor:** Initializes an instance of the `PostModel`, likely representing the data access layer for handling MySQL queries related to posts.

- **create Method:** Accepts a payload and creates a new blog post using the `PostModel`. It returns the created post.

- **getAllPosts Method:** Retrieves all blog posts using the `PostModel` and returns the list of posts.

- **getPostByPostId Method:** Retrieves a specific blog post by `postId` using the `PostModel` and returns the post details.

- **updatePostByPostId Method:** Updates a blog post by `postId` using the `PostModel`. It returns the updated post.

- **deletePostByPostId Method:** Deletes a blog post by `postId` using the `PostModel` and returns the deleted post.

## `UserService (UserService.ts)`

The `UserService` class encapsulates the business logic related to user management in your application.

### Functionality

- **Constructor:** Initializes an instance of the `UserModel`, likely representing the data access layer for handling MySQL queries related to users.

- **create Method:** Accepts a payload and creates a new user using the `UserModel`.

- **getAllUsers Method:** Retrieves all users using the `UserModel` and returns the list of users.
# Development Dependencies

The following development dependencies are utilized in the project to enhance development, testing, and documentation aspects. These dependencies are not required for the production deployment of the application but play crucial roles during development and build processes.

1. **@types/bcrypt:**
+ TypeScript type definitions for the bcrypt library, used for hashing passwords securely.

2. **@types/bluebird:**
+ TypeScript type definitions for the bluebird library, a promise library often used for managing asynchronous operations.

3.  **@types/cors:**
   - TypeScript type definitions for the cors middleware, enabling Cross-Origin Resource Sharing (CORS) in your Express application.

4.  **@types/express:**
   - TypeScript type definitions for the Express framework, providing enhanced type checking and auto-completion when working with Express.

5.  **@types/memory-cache:**
   - TypeScript type definitions for the memory-cache library, used for caching data in memory.

6.  **@types/mongodb:**
   - TypeScript type definitions for MongoDB, providing enhanced type checking when working with MongoDB.

7.  **@types/mongoose:**
   - TypeScript type definitions for Mongoose, an ODM library for MongoDB and Node.js. Enhances type checking for Mongoose models.

8.  **@types/node:**
   - TypeScript type definitions for Node.js, offering type checking and IntelliSense support for Node.js core modules.

9.  **@types/swagger-jsdoc:**
   - TypeScript type definitions for swagger-jsdoc, used to create Swagger/OpenAPI documentation from JSDoc comments.

10.  **@types/swagger-ui-express:**
- TypeScript type definitions for swagger-ui-express, a middleware for serving Swagger UI in your Express application.

11.  **grunt-apidoc:**
- Grunt plugin for generating API documentation. It's listed as a development dependency, but it seems to be unused or unnecessary since the apidoc script is configured differently.

12.  **nodemon:**
+ A utility that monitors changes in your source code and automatically restarts the server. Helpful during development to streamline the development workflow.

13.  **ts-node:**
+ TypeScript execution environment for Node.js, allowing you to run TypeScript files directly without the need for compilation.

14.  **typescript:**
+ The TypeScript compiler, used to transpile TypeScript code into JavaScript. It's a critical development dependency for working with TypeScript.


