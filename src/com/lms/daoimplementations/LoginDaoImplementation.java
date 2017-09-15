package com.lms.daoimplementations;

import com.lms.beans.Login;
import com.lms.daointerfaces.LoginDao;
import com.lms.utilities.DatabaseConnectionUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImplementation implements LoginDao {
	public String validateUser( Login login) throws ClassNotFoundException, SQLException{
        String role = "";
        Connection con = DatabaseConnectionUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select role from login where id=? and password=?");
        psmt.setString(1, login.getUserId());
        psmt.setString(2, login.getPassword());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("role");
        }
        else{
            role = "invalid";
        }
        return role;
    }
}
