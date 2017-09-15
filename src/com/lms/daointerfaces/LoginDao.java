package com.lms.daointerfaces;

import com.lms.beans.Login;
import java.sql.SQLException;

public interface LoginDao {

	public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;

}
