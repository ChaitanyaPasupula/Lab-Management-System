package com.lms.beans;

public class EmployeeDetails {
	private String userId; 
    private String employeeName;
    private String department;
    private String designation;
    private String contactNumber;
    private int numberOfBooksRecieved;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getNumberOfBooksRecieved() {
        return numberOfBooksRecieved;
    }

    public void setNumberOfBooksRecieved(int numberOfBooksRecieved) {
        this.numberOfBooksRecieved = numberOfBooksRecieved;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EmployeeDetails() {
    }
}
