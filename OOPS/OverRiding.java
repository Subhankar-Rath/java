package OOPS;

public class OverRiding {
    public static void main(String agrs[]){
        Animal a=new Animal();
        Deer d=new Deer();
        a.eat();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eating everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eating grass");
    }
}
