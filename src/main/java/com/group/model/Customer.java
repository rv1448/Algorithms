package com.group.model;

public class Customer {
    private String firstname;
    private String lastname;

    public Customer(){

    }

    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
