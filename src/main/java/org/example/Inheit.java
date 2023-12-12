package org.example;
class A{
    public void show(){
        System.out.println("Hello from Class A");
    }
}
class B extends A{
    public void display(){

        System.out.println("Hello from Class B");
    }
}

public class Inheit extends B{
    public static void main(String[] args) {
        Inheit C = new Inheit();
        C.show();
        C.display();
    }
}
