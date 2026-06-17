public class r34 {
    public static void main(String su[]){
        Std s=new Std("subhankar", 90);
        System.out.println(s.name+" "+s.roll);
    }
}
class Std{
    String name;
    int roll;

    public Std(String name, int roll){
        this.name =name;
        this.roll=roll;
    }
}
