💼 Job Seeker Profile Management
A RESTful backend application for managing job seeker profiles, built with Spring Boot 3, Spring Data JPA, and MySQL. This system provides a solid foundation for creating, reading, updating, and deleting job seeker profiles through a clean REST API.

🚀 Features

Create and manage job seeker profiles
Persist data with Spring Data JPA and MySQL
RESTful API endpoints for full CRUD operations
Hot-reload during development via Spring DevTools
Built on Spring Boot 3.5 with Java 17


🛠️ Tech Stack
LayerTechnologyLanguageJava 17FrameworkSpring Boot 3.5.xPersistenceSpring Data JPA (Hibernate)DatabaseMySQLBuild ToolMaven (Maven Wrapper included)Dev ToolsSpring Boot DevTools

📁 Project Structure
Job-Seeker-Profile-Management/
├── src/
│   ├── main/
│   │   ├── java/nh/com/org/ProjectDefense/
│   │   │   ├── controller/       # REST controllers
│   │   │   ├── model/            # Entity classes
│   │   │   ├── repository/       # JPA repositories
│   │   │   └── service/          # Business logic
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── mvnw

⚙️ Prerequisites

Java 17+
MySQL 8.0+
Maven 3.6+ (or use the included ./mvnw wrapper)


🔧 Setup & Configuration
1. Clone the repository
bashgit clone https://github.com/Nuel145/Job-Seeker-Profile-Management-.git
cd Job-Seeker-Profile-Management-
2. Create the MySQL database
sqlCREATE DATABASE job_seeker_db;

3. Configure application.properties
Edit src/main/resources/application.properties:
propertiesspring.datasource.url=jdbc:mysql://localhost:3306/job_seeker_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4. Run the application
bash./mvnw spring-boot:run
The server starts at http://localhost:8080.

📡 API Endpoints
MethodEndpointDescriptionGET/api/jobseekersGet all profilesGET/api/jobseekers/{id}Get profile by IDPOST/api/jobseekersCreate a new profilePUT/api/jobseekers/{id}Update an existing profileDELETE/api/jobseekers/{id}Delete a profile

⚠️ Base paths may vary depending on your controller configuration.


🧪 Running Tests
bash./mvnw test

📦 Build for Production
bash./mvnw clean package
java -jar target/ProjectDefense-0.0.1-SNAPSHOT.jar

🤝 Contributing

Fork the repository
Create a feature branch: git checkout -b feature/your-feature
Commit your changes: git commit -m "Add your feature"
Push to the branch: git push origin feature/your-feature
Open a Pull Request


📄 License
This project is open source and available under the MIT License.

👤 Author
Nuel145 — GitHub Profile
