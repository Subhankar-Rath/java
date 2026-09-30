package ArrayList;
import java.util.ArrayList;

public class Intialization {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(10);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.indexOf(8));


        list.set(0, 2);
        System.out.println(list);
        list.add(0,1);
        System.out.println(list);
        System.out.println(list.contains(50));
    }
}
