package com.lms.services;

import com.lms.beans.Login;
import com.lms.daoimplementations.LoginDaoImplementation;
import com.lms.daointerfaces.LoginDao;
import java.sql.SQLException;

public class LoginService {
	public String validateUser(Login login) throws ClassNotFoundException, SQLException{
        LoginDao loginDao = new LoginDaoImplementation();
        return loginDao.validateUser(login);
    }
}
