package org.example;
class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }

}
public class cons2 {
    public static void main(String[] args) {
        Student s1=new Student(11,"tsr","B.E.");
        Student s2=new Student(12,"rst","BBA",450.5f);
        s1.display();
        s2.display();

    }
}
