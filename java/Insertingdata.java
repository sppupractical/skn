package com.Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertingdata {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS1";
	   static final String USER = "root";
	   static final String PASS = "root";
  public static void main(String[] args) throws ClassNotFoundException {
     // Open a connection
try
      {
    	  Class.forName("com.mysql.jdbc.Driver");  
	   Connection conn=DriverManager.getConnection(  
			   DB_URL, USER, PASS);  
	    
	   Statement stmt=conn.createStatement(); 		      
        // Execute a query
        System.out.println("Inserting records into the table...");          
        String sql = "INSERT INTO REG VALUES (100, 'Zara', 'Ali', 18)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO REG VALUES (101, 'Mahnaz', 'Fatma', 25)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO REG VALUES (102, 'Zaid', 'Khan', 30)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO REG VALUES(103, 'Sumit', 'Mittal', 28)";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table...");   	  
     } catch (SQLException e) {
        e.printStackTrace();
     } 
  }
}

