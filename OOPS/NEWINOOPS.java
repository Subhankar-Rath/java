import java.util.*;
class Complex{
    int real;
    int imag;
    //comstructor
    Complex (int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void add(Complex c){
        int r=this.real+c.real;
        int i=this.imag+c.imag;
        System.out.println(r+"+"+i+"i");
    }
    void diff(Complex c){
        int r=this.real+c.real;
        int i=this.imag+c.imag;System.out.println(r+"+"+i+"i");
    }
    void pro(Complex c){
        int r=this.real*c.real;
        int i=this.imag*c.imag;System.out.println(r+"+"+i+"i");
    }

}
public class NEWINOOPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st number");
        int r1=sc.nextInt();
        int i1=sc.nextInt();    
        System.out.println("2nd number");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);
        c1.add(c2);
        c1.diff(c2);
        c2.pro(c1);
        sc.close();
    }
}
