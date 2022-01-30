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
ResultSet result= statement.executeUpdate(Sql);

After inserting many rows , the table now looks like this: 

![PostgresTable](https://user-images.githubusercontent.com/65030802/151701130-96385616-3cf5-4ba0-aa67-f34302095b35.png)


SELECT Query Example : 

Now let's try to Select from the table all the rows that contains "'Rima KILANY CHAMOUN'".
For that, we executed these instructions : 

String Sql= "SELECT * FROM matieresesib WHERE enseignant='Rima KILANY CHAMOUN'";
Statement statement = connection.createStatement();
ResultSet result= statement.executeQuery(Sql);


The Output that will be given for running the code available in the main  of the "ConnectDataBase" Class is : 

![SelectRes](https://user-images.githubusercontent.com/65030802/151703708-f69dace9-c93c-4cbe-8194-d74d21913873.png)


This output gathered the data from the Query that was given in the code to extract the adequate informations from the table and give the following :

![DataQuery](https://user-images.githubusercontent.com/65030802/151703938-17c3613e-64f6-4365-83d2-1eaea6e0d3ac.png)



Finally, It is important to close the connection  to release any other database resources (cursors, handles, etc.) the connection may be holding on to with this instruction : connection.close();





