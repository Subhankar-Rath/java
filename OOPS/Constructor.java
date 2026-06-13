package OOPS;

public class Constructor {
    public static void main(String a[]){
        Student s1=new Student("subhankar");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;

    Student(String name){
        this.name=name;
    }
}
