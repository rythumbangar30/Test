//Showing Only Essential Feature without Showing any background detail is called Data Abstraction
abstract class Bank{
    abstract int interest();
}
class Kotak extends Bank{
    int interest(){
        return 7;
    }
}
class Au extends Bank{
    int interest(){
        return 8;
    }
}
class consumer{
    public static void main(String args[]){
    Bank b1;
    b1=new Kotak();
    System.out.println("Rate of Interest"+b1.interest());
    b1=new Au();
    System.out.println("Rate of Interest"+b1.interest());
    }
}
