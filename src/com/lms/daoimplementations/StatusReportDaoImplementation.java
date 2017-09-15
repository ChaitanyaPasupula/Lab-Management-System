package com.lms.daoimplementations;

import java.sql.SQLException;
import com.lms.beans.StatusReport;
import com.lms.daointerfaces.StatusReportDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.lms.daointerfaces.StatusReportDao;

public class StatusReportDaoImplementation implements  StatusReportDao{
	public List generateStatusReport() throws ClassNotFoundException, SQLException{
		List employeeList = new ArrayList( );
        Connection con = DatabaseConnectionUtility.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from LMS_STATUS_REPORT");
        StatusReport emp = null;
        while(rs.next()){
            emp = new StatusReport( );
            emp.setUserId(rs.getString("USERID"));
            emp.setBookId(rs.getString("BOOKID"));
            emp.setBookName(rs.getString("BOOKNAME"));
            emp.setIssueDate(rs.getString("ISSUE_DATE"));
            emp.setReturnDate(rs.getString("RETURN_DATE"));
            employeeList.add(emp);

        }
        DatabaseConnectionUtility.closeConnection(con);

        return employeeList;
		
	}
}
