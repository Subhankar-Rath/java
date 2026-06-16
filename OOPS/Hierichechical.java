package OOPS;

public class Hierichechical {
    public static void main(String args[]){
        Mammel m=new Mammel();
        m.eat();
        Fish f=new Fish();
        f.breath();

    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breath(){
        System.out.print("breathing..");
    }
}

class Mammel extends Animal{
    void walk(){
        System.out.println("walking..");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swimming");
    }
}
