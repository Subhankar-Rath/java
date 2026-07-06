public class SuperClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        System.out.println("horse");
    }
}
