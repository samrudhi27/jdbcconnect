package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/telstra";
		String username="root";
		String password="root";
		String deleteCommand="delete from employee where empid=101;";
		int i=0;
		Connection cn=null;
		Statement st=null;
		try {
			cn=DriverManager.getConnection(url, username, password);
			st=cn.createStatement();
			i=st.executeUpdate(deleteCommand);
			System.out.println(i+" employee deleted.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
