package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(9);
        System.out.println(list);
        //ascending order
        Collections.sort(list);
        System.out.println(list);
        //decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }    
}
