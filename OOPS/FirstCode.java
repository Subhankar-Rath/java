package OOPS;

public class FirstCode {
    public static void main(String a[]){
        Pen p1=new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.tip=5;
        System.out.println(p1.tip);
    }
}
    class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color=newColor;
        }
        void changeTip(int newTip){
            tip=newTip;
        }
    }
    class Student{
        int age;
        String name;
        float percentage;

        void calPercentage(int phy,int chem,int math){
            percentage=(phy+chem+math)/3;
        }
    }

