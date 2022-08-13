package com.cg.dbcurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="";
		String dbUsername="";
		String dbPassword="";
		try {
			Connection c= DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query="UPDATE EMPLOYEE SET NAME=?, EMAIL=?,WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
		
			p.setString(1,"Rahul");
			p.setString(2,"rahul.singh.7920000@gmail.com");
			p.setInt(3, 101);
			
			
			int r= p.executeUpdate();
			//if row>0 it means atleast some rows aree there 
			if(r>0) {
				System.out.println("A new user is Updated Successfully");
				}
			c.close();
			}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
