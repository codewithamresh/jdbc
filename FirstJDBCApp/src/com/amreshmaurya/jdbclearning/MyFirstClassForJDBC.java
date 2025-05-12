package com.amreshmaurya.jdbclearning;

import java.sql.*;

public class MyFirstClassForJDBC {

	public static void main(String[] args) {
		
	String url = "jdbc:mysql://localhost:3306/jdbclearning";
	String username = "root";
	String password = "Mysql@001";

		// Establish connection
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connected to the database!");

			// Create a statement
			Statement stmt = connection.createStatement();

			// create
			String sql = "INSERT INTO  studentinfo(id,name,age,city) VALUES (3,'Ajay',25,'Rae Bareli');";
		
			// update
			 sql = "UPDATE  studentinfo  SET name='Anoop' WHERE id=3;";
			 
		    // delete
			 sql = "DELETE FROM studentinfo WHERE id=2;";
			
			 
			 //read 
			 sql = "SELECT * from studentinfo;";
			 
//			int rowAffected = stmt.executeUpdate(sql);
			 
//		if(rowAffected !=0) {
//			System.out.println("Data inserted successfully");
//		}
		
		ResultSet rs =	 stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+ " " 
	+ rs.getInt(3) +" "	+ rs.getString(4));
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// This block will be executed after try-catch
			System.out.println("Finally block executed.");
		}
		

		

	}

}
;