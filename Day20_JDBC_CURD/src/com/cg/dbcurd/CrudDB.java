package com.cg.dbcurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) throws SQLException{
		String dbURL="";
		String dbUsername="";
		String dbPassword="";
		try {
		 //to check wheather the eclipse is connected withMy_SQL
		Connection c= DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		if (c!=null) {
			System.out.println("Connection is Established");
			//once the connection is started we need to close it.
			c.close();
		}
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}
}
