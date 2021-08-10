package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product_Jdbc {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/product_info";
		String username="root";
		String password="root";
		//String createtable="create table product1(prodId int(4), prodName varchar(20), prodPrice int(5), inStock varchar(4));";
		String updateCommand="update product SET prodName='lg washing machine' where prodId=2;";
		//String insertCommand="insert into product values(2,'lg tv',35000,'yes');";
		int i=0;
		Connection cn=null;
		Statement st=null;
		cn=DriverManager.getConnection(url, username, password);
		st=cn.createStatement();
		//i=st.executeUpdate(createtable);
		i=st.executeUpdate(updateCommand);
		System.out.println(i+" No of records added.");

	}

}
