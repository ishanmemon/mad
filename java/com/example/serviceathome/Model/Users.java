package com.example.serviceathome.Model;

public class Users
{
    //This class while help us to retrieve all details of users fom DB

    //Variables name must be same as DB name
    private String name, phone, password;


    //Initial Default constructor
    public Users()
    {

    }


    //Constructor with parameters
    public Users(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
