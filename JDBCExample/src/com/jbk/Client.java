package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			while(resultSet.next()) {  
				System.out.println(resultSet.getInt(1)+"  "+
						resultSet.getString(2)+"  "+resultSet.getString(3));
			}
			connection.close();			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}

}
