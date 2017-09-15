package com.lms.controllers;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.beans.Login;
import com.lms.services.LoginService;

public class LoginController extends HttpServlet {
	
	public void init( ){
        // no code
    }
   
    public void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String role = "";
        Login loginInfo = new Login( );
        loginInfo.setUserId(userId);
        loginInfo.setPassword(password);
        LoginService loginService = new LoginService( );
        try{
         role = loginService.validateUser(loginInfo);
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
        }
        if( role.equalsIgnoreCase("admin")){
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
           
            RequestDispatcher rd = request.getRequestDispatcher("adminHomePage.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("user")){
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
           
            RequestDispatcher rd = request.getRequestDispatcher("userHomePage.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("invalid")){
          
            RequestDispatcher rd = request.getRequestDispatcher("invalidPage.jsp");
            rd.forward(request, response);

        }
    }

   public void destory( ){
       // no code
   }

   
}
