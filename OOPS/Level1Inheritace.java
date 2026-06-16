package OOPS;

public class Level1Inheritace {
    public static void main(String args[]){
    Fish f1=new Fish();
    f1.eat();
    f1.color="blue";
    System.out.println(f1.color);    
}
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating..");
    }
    void breathe(){
        System.out.println("breathing..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swimming..");
    }
    int fins;
}
