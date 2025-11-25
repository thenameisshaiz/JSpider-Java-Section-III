package com.advancedoops.exceptionalhandling;

import java.util.Scanner;

class UserService{
    public void login(String username, String password) throws IllegalArgumentException{
        String un = "user1";
        String pass = "pass@123";
        if(username.equals(un) && password.equals(pass)){
            System.out.println("Login Successfully");
        }
        else{
            System.out.println("Login Failed");
            IllegalArgumentException ie = new IllegalArgumentException("Invalid username or password");
            throw ie;
        }
    }

    public void showHomePage(){
        System.out.println("It's the Homepage...");
    }
}
public class MainClass07 {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        Scanner input = new Scanner(System.in);
        UserService us1 = new UserService();

        System.out.print("Enter the username: ");
        String username = input.next();
        System.out.print("Enter the password: ");
        String password = input.next();
        System.out.println();

        us1.login(username,password);
        us1.showHomePage();
        System.out.println("Program ends...");
    }
}
