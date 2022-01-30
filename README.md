# JDBC-Database-Connection
Java JDBC PostgreSQL Connection

This project represents how to connect a Java Application  with a PostgreSQL database using  JDBC driver.

The driver used for this project is JDBC Postgresql installed from https://jdbc.postgresql.org/download/postgresql-42.3.1.jar . 

After its installation as well as its reference in the source java file in IntelliJ, i was able to manipulate and execute Queries as well as Update the Tables.

In order to connect them,java.sql.Connection as well as  java.sql.DriverManager should be imported.
the following instruction : Connection connection = DriverManager.getConnection(Jdbc_Url,username,pass) serves to establish the connection;the parameters passed are the JDBC URL as well as the username and password to connect to the Database.

After Connecting to the database, We can control the table and insert/update or execute queries. 

INSERT Example: 

First we need to import java.sql.Statement and java.sql.ResultSet;
To insert in the table, run these instructions :
String Sql = "INSERT INTO MatieresEsib (Code, Nom_Matiere, Enseignant,Type_Genie)" + "VALUES ('020GDEES4' ,'Gestion des données d entreprise', 'Rima KILANY CHAMOUN','CCE')";
Statement statement = connection.createStatement();
ResultSet result= statement.executeQuery(Sql);

After inserting many rows , the table now looks like this: 

![PostgresTable](https://user-images.githubusercontent.com/65030802/151701130-96385616-3cf5-4ba0-aa67-f34302095b35.png)
