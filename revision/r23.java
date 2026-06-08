import java.util.Scanner;

public class r23 {
     public static void main(String args[]){
        int arr[]={1, 3, 7, 8, 10};
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=arr[i];
                break;
            }
        }
        System.out.println(even);
    }
}
