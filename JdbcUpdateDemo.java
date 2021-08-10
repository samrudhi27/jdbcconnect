package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/telstra";
		String username="root";
		String password="root";
		String updateCommand="update employee SET designation='SR Manager' where empid=101;";
		int i=0;
		Connection cn=null;
		Statement st=null;
		try {
			cn=DriverManager.getConnection(url, username, password);
			st=cn.createStatement();
			i=st.executeUpdate(updateCommand);
			System.out.println(i+" Updated employee details.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
