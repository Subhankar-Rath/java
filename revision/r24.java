import java.util.*;
public class r24 {
    public static void main(String args[]){
        int arr[]={10, 15, 25, 40};
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            diff=Math.abs(arr[i]-arr[i+1]);
        }
        System.out.print(Arrays.toString(arr));
    }
}
