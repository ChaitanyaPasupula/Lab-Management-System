package com.lms.beans;

import java.io.Serializable;

public class Login implements Serializable{
	
	
	private String userId;
	 private String password;
	 private String role;

	 public Login( ){
	        // no code
	    }
	    
	 public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public void setUserId(String userId) {
	        this.userId = userId;
	    }

}