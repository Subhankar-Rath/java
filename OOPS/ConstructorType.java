package OOPS;

public class ConstructorType {
    public static void main(String a[]){
        Student s1=new Student();
        Student s2=new Student("Rath");
        System.out.println(s2.name);
        Student s3=new Student(90);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("subhankar");
    }
    Student(String name){
         this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
