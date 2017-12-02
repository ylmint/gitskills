package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.pojo.Book;

public class BookService {

	static String driver;
	static String url;
	static String username;
	static String password;
	
	public BookService(){
		try{
			
			Properties prop = new Properties();
			prop.load(this.getClass().getResourceAsStream("db.properties"));
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public List getBookList(){
		
		List list = new ArrayList();
		
		try{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from tbl_books");
			
			while(rs.next()){
				Book book = new Book();
				book.setIsbn(rs.getString("isbn"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getString("price"));
				list.add(book);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list;
	}
}

