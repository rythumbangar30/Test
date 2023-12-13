package org.example;

public class cons1 {
    int id;
    String name;
    cons1(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        cons1 c1=new cons1(11,"rist");
        cons1 c2=new cons1(22,"tsir");
        c1.display();
        c2.display();
    }
}
