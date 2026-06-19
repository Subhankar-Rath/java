package OOPS;

public class AbstractClass {
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
        h.ChangeColor();
        System.out.println(h.color);
    }
}

 abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("eating");
    }
    abstract void walk();
}
class Horse extends Animal{
    void ChangeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("2 legs");
    }
}

