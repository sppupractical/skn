package com.Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tablecreation {
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
          String sql = "CREATE TABLE REG " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

