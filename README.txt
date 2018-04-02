Hibernate integration with Java (Eclipse IDE) and MySQL.

=======This tutorial should work for any IDE with slight modifications and also for any DB management (PostgreSQL, etc.)=======


You will need the latest version of Java installed and an Eclipse IDE (Neon, Enterprise, etc. but to be updated).
Hibernate integration works regardless if your app is a desktop app or a webapp.

1. Download the latest stable release of Hibernate 5.
2. A New User Library containing all the JAR files included in the hibernate-release-5.X.X.Final/lib/required
   How to create a User Library:
    a) Create an User Library: select LibrariesTab | Add Library | User Library. 
    b) Click on the User Library button and select New. 
    c) Enter a name for it and add Hibernate libraries by clicking on Add External JARs
3. A JDBC Driver for connecting to the Database. In our case we will use MySQL JDBC Driver
   This can be downloaded by searching on google 'mysql connector' and downloading the last version.
   Add as External JAR the connector jar.
4. Next thing, we have to add the Entities which will be the relational tables. These are known as JavaBeans.
   In our case, these Entities were EnterpriseAccount, FamilyAccount, Call, Message, etc. They are simple classes
   where you define class attributes and generate getters and setters. Take care to define a no arg constructor
   since Hibernate will call it and by reflection and getters and setter will persist the database.
5. Create a file named hibernate.cfg.xml, in the root of your project. In case you are using Maven, you need the 
   to explicitly create the next file architecture: src/java/resources and place the configuration file in resources.
   hibernate.cfg.xml configures the dialect, the JDBC parameters, the connection pool, the cache provider and the single
   classes mapped. You can copy/paste it, but you should change the username, password and the url to the database. 
   <property name="hibernate.connection.url">jdbc:mysql://localhost/phonecompanydb</property> this links Hibernate to the 
   database phonecompanydb, found in MySQL. Replace phonecompanydb with your DB. The username and the password should be the same
   as the ones you use in MySQL.
   Next, by typing "<mapping class="service.Service"/>" in the configuration file, it means that the class Service 
   in the package service will be mapped to a table in MySQL. Replace Service and the package with you packages and classes.
6. Now, there are two options: either go xml-based or annotation-based. Since we have worked with annotations, this is what we
   will explain in depth.
7. Above your bean class, annotate it with @Entity and @Table(name = "tablename"). After that annotate every instance variable
   with @Column(name = "columnname"). So, basically your class will be a table, with the instace variables as columns.  
8. Next, you need a SessionFactory, which should implement the Singleton design pattern. See the class SessionFactoryUtil in the package
   dao. It should be a copy/paste.
9. See Appendix1 for a short testing of Hibernate. See AbstractDAO (package dao) for how to write queries and 
   accessing the database using reflection.
10. Do not forget to create the database and the tables with the exact same columns as the ones declared in the Java classes.
11. Now you can test the connection with the database by trying to add a new entry in one table.


Frequent Problems:

1. Make sure that the name of the database is the same in MySQL as in Java code. The same for the tables and for each field!!!
2. Make sure to check that the name of the database/table/column is not a reserved word in MySQL!!!

Note: Feel free to update any of these instructions and to also check them by accessing tutorials related to Hibernate on the internet.

Useful resources and tutorials:
1. http://www.mastertheboss.com/jboss-frameworks/hibernate-jpa/quickstart-tutorials-hibernate-jpa/hibernate-tutorial-with-eclipse?showall=
2. https://www.tutorialspoint.com/hibernate/hibernate_configuration.htm
3. http://www.codejava.net/frameworks/hibernate/hibernate-hello-world-tutorial-for-beginners-with-eclipse-and-mysql
4. http://www.baeldung.com/hibernate-criteria-queries   

Appendix1:

public static void main(String[] args){
	Session session = SessionFactoryUtil.getSessionFactory().getCurrentSession();
	Person person = new Person();
	person.setName("Andrei");
	person.setSurname("Baraian");       
	person.setAddress("Cluj-Napoca, Romania");       
	session.save(person);
}