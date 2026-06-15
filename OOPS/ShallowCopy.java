package OOPS;

public class ShallowCopy {
    public static void main(String[] args) {
        int marks[]={100,80,70};
        Student s1=new Student("subhankar",marks);
        Student s2=new Student(s1);
        s2.marks[0]=99;
        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[0]);
    }
}
class Student{
    String name;
    int[] marks;

    Student(String name,int[]marks){
        this.name=name;
        this.marks=marks;
    }
    Student(Student s){
        this.name=s.name;
        this.marks=s.marks;
    }
}