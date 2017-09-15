package com.lms.daoimplementations;

import com.lms.beans.EmployeeDetails;
import com.lms.daointerfaces.EmployeeDetailsDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDetailsDaoImplementation implements EmployeeDetailsDao{
	
	public String getEmployeeDetails(String uid) throws ClassNotFoundException, SQLException{
        String details=" ";
        Connection con = DatabaseConnectionUtility.getConnection();
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select * from lms_employee_details where userid=uid");
        
        while(rs.next()){
             details="User id::"+" "+rs.getString("USERID")+" "+"Employee Name::"+" "+rs.getString("EMPLOYEENAME")+"Department"+" "+rs.getString("DEPARTMENT")+"Designation"+" "+rs.getString("DESIGNATION")+"Contact Number::"+" "+rs.getString("CONTACT_NUMBER")+" "+"Number of books Received::"+" "+rs.getString("NUMBER_OF_BOOKS_RECIEVED");
            }
        DatabaseConnectionUtility.closeConnection(con);

        return details;
    }
    public void returnBook(String uid,String bookId) throws ClassNotFoundException, SQLException{
    	Connection con = DatabaseConnectionUtility.getConnection();
        Statement stmt = con.createStatement();
        Statement stmt1=con.createStatement();
        Statement stmt2=con.createStatement();      
        stmt.executeUpdate("delete from LMS_STATUS_REPORT where userid=uid and bookid=bookId"); 
        stmt1.executeUpdate("update LMS_EMPLOYEE_DETAILS set NUMBER_OF_BOOKS_RECIEVED=NUMBER_OF_BOOKS_RECIEVED-1 WHERE useiId=uid");
        stmt2.executeUpdate("update LMS_BOOK_DETAILS set book_status='AVAILABLE'  where bookid=bookId");
        DatabaseConnectionUtility.closeConnection(con);
    }
   
    public String issueBook(String bookName,String uid) throws ClassNotFoundException, SQLException{
    	String output;
    	Connection con = DatabaseConnectionUtility.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from LMS_EMPLOYEE_DETAILS where userid=uid"); 
        while(rs.next()){
        	if(rs.getInt("NUMBER_OF_BOOKS_RECIEVED")<5){
        		Statement stmt1 = con.createStatement();
                ResultSet rs1=stmt1.executeQuery("select count(bookname) as count from LMS_BOOK_DETAILS where BOOK_STATUS='AVAILABLE'"); 
        		while(rs1.next()){
        			if(rs1.getInt("count")>0){
        				Statement stmt2 = con.createStatement();
        				ResultSet rs2=stmt2.executeQuery("select * from LMS_STATUS_REPORT where userid=uid");
        				while(rs2.next()){
        					if(rs2.getString("BOOKNAME").equalsIgnoreCase(bookName)){
        						output="BOOK WITH SAME NAME CANNOT BE ISSUED TWICE";
        						return output;
        						}
        					else{
        						Statement stmt3 = con.createStatement();
        						stmt3.executeUpdate("insert into LMS_STATUS_REPORT values(uid,&bookId,bookName,)");
        					}
        				}
        			}
        		}
        	}
        }
    }
    

}


