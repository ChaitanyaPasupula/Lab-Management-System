package com.lms.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import com.lms.daointerfaces.BookDetailsDao;
import com.lms.utilities.DatabaseConnectionUtility;

public class BookDetailsDaoImplementation implements BookDetailsDao{


	public void addBook() throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 PreparedStatement pstmt=null;
		 String bookId="";
		 String bookName="";
		 String author="";
		 String publication="";
		 pstmt=con.prepareStatement("insert into LMS_BOOK_DETAILS values(?,?,?)");
		 pstmt.setString(1, bookId);
		 pstmt.setString(2, bookName);
		 pstmt.setString(3, author);
		 pstmt.setString(3, publication);
		 pstmt.executeUpdate();
		 
		 DatabaseConnectionUtility.closeConnection(con);
		 		
	}
	public void deleteBook(String bookId) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 Statement stmt=con.createStatement();
		 stmt.executeUpdate("delete from LMS_BOOK_DETAILS where bookid=bookId"); 
		 
		 DatabaseConnectionUtility.closeConnection(con);
	}
	public void updateBook(String bookId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException{
		 Connection con = DatabaseConnectionUtility.getConnection();
		 Statement stmt=con.createStatement();
		 stmt.executeUpdate("update LMS_BOOK_DETAILS set selectionAttribute=selectionValue where bookid=bookId");
		 
		 DatabaseConnectionUtility.closeConnection(con);
	}
}
