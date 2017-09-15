package com.lms.daointerfaces;


import java.sql.SQLException;


public interface EmployeeDetailsDao {
	   
		public abstract String getEmployeeDetails(String uid) throws ClassNotFoundException, SQLException;
	    public abstract void reserveBook(String bookName) throws ClassNotFoundException, SQLException;
	    public abstract void returnBook(String uid,String bookId) throws ClassNotFoundException, SQLException;
	    public abstract String issueBook(String bookName,String uid) throws ClassNotFoundException, SQLException;
	    
	}


