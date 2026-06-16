package OOPS;

public class Hybrid {
    public static void main(String a[]){
        Fish f=new Fish();
        f.eat();
        Bird b=new Bird();
        b.eat();
    }
}
class Animal{
    String name;
    void eat(){
        System.out.println("eating..");
    }
    void breath(){
        System.out.println("nreathing..");
    }
}

class Fish extends Animal{
    void tuna(){
        System.out.println("tuna");
    }
    void shark(){
        System.out.println("shark");
    }
}
class Bird extends Animal{
    void peacock(){
        System.out.println("peacock");
    }
}

class Mammel extends Animal{
    void dog(){
        System.out.println("dog");
    }
    void cat(){
        System.out.println("cat");
    }
    void human(){
        System.out.println("human");
    }
}