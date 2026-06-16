package OOPS;

public class MultiLevelInheritace {
    public static void main(String[] args) {
     Dog d1=new Dog();
     d1.eat();
     d1.legs=4;
     System.out.println(d1.legs); 
    }
}
class Animal{
    void eat(){
        System.out.println("eating..");
    }
    void breath(){
        System.out.println("breathing");
    }
    String color;
}
class Mammel extends Animal{
    int legs;
} 
class Dog extends Mammel{
    String breed;
}
