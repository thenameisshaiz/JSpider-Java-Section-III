package com.advancedoops.exceptionalhandling;

import java.util.Scanner;

class UserUtility{
    public void login(String username, String password) throws IllegalArgumentException{
        String un = "user01";
        String pass = "pass@123";

        if(username.equals(un)&& password.equals(pass)){
            System.out.println("User logged-in Successfully");
        }
        else{
            IllegalArgumentException ie = new IllegalArgumentException("Invalid username or password");
            System.out.println("Login Failed...");
            throw ie;
        }
    }

    public void showHomePage(){
        System.out.println("Re-directing to HomePage...");
    }
}
public class MainClass08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserUtility u1 = new UserUtility();

        System.out.print("Enter the username: ");
        String username = input.next();
        System.out.print("Enter the password: ");
        String password = input.next();

        u1.login(username, password);
        u1.showHomePage();
    }


}
