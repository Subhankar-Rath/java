package OOPS;

public class AbstractClass1 {
    public static void main(String args[]){
        Mustang m=new Mustang();
    }    
}
 abstract class Animal{
    Animal(){
        System.out.println("animal const");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse const");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang");
    }
}
