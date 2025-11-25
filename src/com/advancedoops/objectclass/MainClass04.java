package com.advancedoops.objectclass;

class Product extends Object{
    private int pid;
    private String pname;
    private double price;
    private String ptype;

    // Setter methods
    public void setpid(int pid){
        this.pid = pid;
    }

    public void setpname(String pname){
        this.pname = pname;
    }

    public void setprice(double price){
        this.price = price;
    }

    public void setptype(String ptype){
        this.ptype = ptype;
    }

    //Getter methods
    public int getpid(){
        return this.pid;
    }

    public String getpname(){
        return this.pname;
    }

    public double getprice(){
        return this.price;
    }

    public String getptype(){
        return this.ptype;
    }

    @Override
    public int hashCode(){
        return this.pid = pid;
    }

    @Override
    public String toString(){
        return "Product Details: ProductID: "+getpid()+", Product Name: "+getpname()+", Price: "+getprice()+", Product Type: "+getptype();
    }

    @Override
    public boolean equals(Object obj){
        Product pro = (Product) obj;
        return pro.pid == this.pid;
    }
}
public class MainClass04 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setpid(3001);
        p1.setpname("Product1");
        p1.setprice(7200.0);
        p1.setptype("Electronic");

        Product p2 = new Product();
        p2.setpid(3002);
        p2.setpname("Product2");
        p2.setprice(6600.0);
        p2.setptype("Cosmetic");
        System.out.println();

        String str1 = p1.toString();
        System.out.println(str1);

        String str2 = p2.toString();
        System.out.println(str2);

        boolean b1 = str2.equals(str1);
        System.out.println(b1);

    }
}
