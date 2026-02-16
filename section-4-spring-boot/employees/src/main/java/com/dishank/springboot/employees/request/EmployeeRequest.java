package com.dishank.springboot.employees.request;

public class EmployeeRequest {
    private String firstName;
    private String LastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public EmployeeRequest(String lastName, String email, String firstName) {
        LastName = lastName;
        this.email = email;
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
