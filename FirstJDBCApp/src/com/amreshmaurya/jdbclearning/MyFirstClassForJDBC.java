package com.amreshmaurya.jdbclearning;

import java.sql.*;

public class MyFirstClassForJDBC {

	public static void main(String[] args) {
		
	String url = "mysql://localhost:3306/jdbclearning";
	String user = "root";
	String password = "Mysql@001";
	Connection connection = null;	
		
		
		try {
			
		
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish connection
   	    connection = DriverManager.getConnection(url,user,password);
	     
   	    Statement statement = connection.createStatement();
		
   	    // execute query
   	    String sql = "INSERT INTO studentinfo (id,name,age,city) VALUES (1,'Amresh',24,'Amethi')";
   	    
   	    int rowAffected = statement.executeUpdate(sql);
   	    
   	    // process the result
   	    if(rowAffected == 0) {
   	    	System.out.println("Failed to insert data");
   	    }else {
   	    	System.out.println("Data insert successfully");
   	    }
   	    //close the resources
   	    statement.close();
   	    connection.close();
   	    
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.print("finally block");
			
		}
		

	}

}
;