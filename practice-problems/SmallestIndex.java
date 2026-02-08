import java.util.*;
public class SmallestIndex {
    public static int smallest(int number[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<number.length-1;i++){
            if(number[i]<small){
                small=number[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6};
        int x=smallest(number);
        System.out.println(x);
    }
}
