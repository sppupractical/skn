package com.Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Displaydata {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS1";
	   static final String USER = "root";
	   static final String PASS = "root";
   static final String QUERY = "SELECT id, first, last, age FROM REG";
   public static void main(String[] args) throws ClassNotFoundException {
      // Open a connection
	   try
	      {
	    	  Class.forName("com.mysql.jdbc.Driver");  
		   Connection conn=DriverManager.getConnection(  
				   DB_URL, USER, PASS);  
		    
		   Statement stmt=conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      		      
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
