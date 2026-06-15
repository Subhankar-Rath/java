package OOPS;

public class DeepCopy {
    public static void main(String[] args) {
        int[]marks={1,1,1};
     Student s1=new Student("subhankar",marks);
     Student s2=new Student(s1);
     s1.marks[0]=100;
     System.out.println(s1.marks[0]);
     System.out.println(s2.marks[0]);  
    }
}
class Student {
    String name;
    int[] marks;
    Student(String name,int[] marks){
        this.name=name;
        this.marks=marks;
    }
    Student(Student s){
        this.name=s.name;
        this.marks=new int[s.marks.length];
        for(int i=0;i<s.marks.length;i++){
            this.marks[i]=s.marks[i];
        }
    }
}
