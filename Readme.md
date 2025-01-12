
# HR Application

This is a Maven-based HR application designed for managing various HR-related tasks. The project is built with Java and uses Spring Boot as its backend framework. This guide will walk you through the steps to set up and run the project in IntelliJ IDEA.

## Prerequisites

Before you start, ensure you have the following installed:

- [Java JDK 17 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven 3.8+](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Git](https://git-scm.com/)

## Getting Started

Follow these steps to set up and run the project:

### 1. Clone the Repository

Open a terminal and clone the repository to your local machine:

```bash
git clone https://github.com/ralphses/hr-application.git
cd hr-application
```

### 2. Open the Project in IntelliJ IDEA

1. Launch IntelliJ IDEA.
2. Select **File > Open** and navigate to the directory where you cloned the repository.
3. Choose the `pom.xml` file in the project root and click **Open as Project**.
4. IntelliJ IDEA will automatically import the Maven project.

### 3. Set Up the JDK

1. In IntelliJ IDEA, go to **File > Project Structure > Project**.
2. Under **Project SDK**, select your installed JDK (17 or higher). If not listed, click **Add SDK** and locate your JDK installation directory.
3. Ensure the **Language Level** matches your JDK version.

### 4. Install Dependencies

Maven will handle dependency installation. If IntelliJ does not automatically resolve dependencies:

1. Open the **Maven** tool window (usually on the right side of IntelliJ).
2. Click the **Reload All Maven Projects** button (a circular arrow icon).

### 5. Configure the Application

1. Create a new file named `application.properties` in the `src/main/resources` directory.
2. Add your database and other configurations. For example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hr_db
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

### 6. Run the Application

1. Navigate to the `HrApplication.java` file in the `src/main/java` directory.
2. Right-click on the file and select **Run 'HrApplication.main()'**.
3. The application should start, and you can access it at `http://localhost:8080`.

### 7. Run Tests (Optional)

To run tests:

1. Open the **Maven** tool window.
2. Expand **Lifecycle** and double-click **test**.

## Troubleshooting

- **Dependency Issues:** If you face issues resolving dependencies, try running `mvn clean install` in the terminal.
- **Database Connection Errors:** Ensure your database is running, and the credentials in `application.properties` are correct.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request.