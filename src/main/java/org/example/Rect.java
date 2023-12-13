package org.example;
class Recat{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculateArea(){
        System.out.println(length*width);
    }
}
public class Rect {
    public static void main(String[] args) {
        Recat r1=new Recat();
        Recat r2=new Recat();
        r1.insert(10,15);
        r2.insert(15,12);
        r1.calculateArea();
        r2.calculateArea();
    }
}
