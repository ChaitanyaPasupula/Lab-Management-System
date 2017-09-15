package com.lms.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtility {
	public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con =DriverManager.getConnection("jdbc:oracle:thin:@hstslc015:1521:ELP","elp1686","msat123$");
            return con;

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
