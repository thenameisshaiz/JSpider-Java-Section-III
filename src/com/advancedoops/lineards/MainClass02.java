package com.advancedoops.collectionframeworks;

class Products{
    private int pid;
    private String pname;
    private double price;
    private String pType;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public String getpType() {
        return pType;
    }

    @Override
    public String toString() {
        return "PID: "+getPid()+", ProductName: "+getPname()+"Price: "+getPrice()+", ProductType: "+getpType();

    }
}

public class MainClass02 {
    public static void main(String[] args) {
        Products p1 = new Products();
        p1.setPid(1001);
        p1.setPname("Protronics Keyboard");
        p1.setPrice(1200);
        p1.setpType("Electronics- Keyboard");

        Products p2 = new Products();
        p2.setPid(1002);
        p2.setPname("Ant ESports KM1200");
        p2.setPrice(998);
        p2.setpType("Electronics- Keyboard");

        Products p3 = new Products();
        p3.setPid(2001);
        p3.setPname("DELL Latitude 3340");
        p3.setPrice(39000);
        p3.setpType("Electronics- Laptop");

        Products pList[] = new Products[4];
        pList[0] = p1;
        pList[1] = p2;
        pList[2] = p3;

        for(Products pro:pList){
            System.out.println(pro);
        }
    }
}
