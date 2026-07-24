/**
 * Interface
*/
interface A{
    void show();
}
interface B{
    void show();
}
class C implements A,B{
    @Override
    public void show(){
        System.out.println("LOVE");
    }
}
public interface Interface {
    public static void main(String[] args) {
        C o=new C();
        o.show();
    }
    
}