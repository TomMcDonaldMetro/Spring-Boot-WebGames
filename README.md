Turning Java EE project into Spring Boot project.

Spring Boot projects by default contain an embedded tomcat server. 

To Run:

* Spring Boot will try to access database on start-up for login credentials
	so SQL data must be available on local machine. *
	
1. Download database file.
2. Change src/main/resources/application.properties file to point toward local database containing web_games.
3. Run SpringBootWebGamesApplication.java as a Java Application.
 3*. Alternatively, in command prompt type: mvn spring-boot:run
4. Open web browser to localhost:8080
5. Home page should be open.
