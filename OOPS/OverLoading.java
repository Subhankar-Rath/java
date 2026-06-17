package OOPS;

public class OverLoading {
    public static void main(String a[]){
        Std s=new Std();
        System.out.println(s.sum(1,2));
        System.out.println(s.sum(1.5f,2.5f));
        System.out.println(s.sum((float)1.5,(float)2.5));
        System.out.println(s.sum(1,2,3));
        
    }
}
class Std{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
