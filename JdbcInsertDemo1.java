package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/telstra";
		String username="root";
		String password="root";
		String insertCommand="insert into employee values(101,'Samrudhi','Engineer');";
		int i=0;
		Connection cn=null;
		Statement st=null;
		try {
			cn=DriverManager.getConnection(url, username, password);
			st=cn.createStatement();
			i=st.executeUpdate(insertCommand);
			System.out.println(i+" No of records added.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
