public class StaticKeyword {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s2.schoolName="PHSE";
        s1.schoolName="ssvm";
        System.out.println(s2.schoolName);
        Student s3=new Student();
        System.out.println(s2.returnPercentage(20,30,40));

    }
}
class Student{
    static int returnPercentage(int phy,int chem,int math){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
