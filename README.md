This application lets a user to add an employee, retrieve all the employees, edit or delete an employee. The front end is designed using
AngularJS and backend is built using Spring Boot and Java.

How to build the project:

1.  Extract the zip folder to a particular destination in your local.
2.  Make sure you have java, maven installed.
3.  Run mvn clean install in the project. A target folder will be generated inside the project.
4.  Inside the target folder run this command. java -jar employee-0.0.1-SNAPSHOT.jar
5.  Spring boot starts a tomcat server on port 8080.
6.  Go to a browser and hit http://localhost:8080/home
7.  Enter a name and hit add button.
8.  You will have the name added to the list. You will see edit and delete beside each name on the list.
9.  Hit edit to change the name and delete to delete it from the list.
10. Based on the _Jenkinsfile_ a pipeline job for this repo will be created in Jenkins.
