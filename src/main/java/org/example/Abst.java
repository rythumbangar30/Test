package org.example;
abstract class Animal{
    public abstract void Pig();
    public void show(){
        System.out.println("class animal");
    }
}
class Zip extends Animal{
   public void Pig(){
        System.out.println("Zig and wee from class Animal");
    }
}
public class Abst extends Zip {
    public static void main(String[] args) {


        Abst hid = new Abst();
        hid.Pig();
        hid.show();
    }
}