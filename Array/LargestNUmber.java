package Array;
import java.util.*;
public class LargestNUmber {
    public static int largestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE;        
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest"+smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        System.out.println("smallest is "+largestNumber(numbers));
    }
    
}
