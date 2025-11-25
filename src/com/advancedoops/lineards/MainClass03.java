package com.advancedoops.collectionframeworks;

class Users{
    private int userID;
    private String userName;
    private String userType;
    private String subscription;

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserType() {
        return userType;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "UserID: "+getUserID()+", UserName: "+getUserName()+", UserType: "+getUserType()+", Subscription: " + getSubscription();
    }
}

public class MainClass03 {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.setUserID(1001);
        u1.setUserName("WILLIAM");
        u1.setUserType("ADMIN");
//        u1.setSubscription("2 Months");

        Users u2 = new Users();
        u2.setUserID(10011);
        u2.setUserName("ALLEN");
        u2.setUserType("Free User");
        u2.setSubscription("2 Months");

        Users u3 = new Users();
        u3.setUserID(10021);
        u3.setUserName("RYAN");
        u3.setUserType("Premium User");
        u3.setSubscription("1 Year");

        Users u4 = new Users();
        u4.setUserID(10001);
        u4.setUserName("ATLAS");
        u4.setUserType("Trial User");
        u4.setSubscription("No Subscription");

        Users uList[] = new Users[4];
        uList[0] = u1;
        uList[1] = u2;
        uList[2] = u3;
        uList[3] = u4;

        for(Users users:uList){
            System.out.println(users);
        }
    }
}
