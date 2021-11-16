package com.example.serviceathome.Prevalent;

import com.example.serviceathome.Model.Users;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Prevalent
{
    /*
     This class is use for to get current users.
     It will help us for ForgetPassword, RememberMe and so on.
    */

    public static Users currentOnlineUser;

    //Two variable to store value
    public static final String UserPhoneKey = "UserPhone";
    public static final String UserPasswordKey = "UserPassword";
}
