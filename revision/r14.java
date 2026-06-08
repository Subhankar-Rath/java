import java.util.*;
public class r14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int count=0;
        int arr[]={5, 12, 8, 20, 15};
        for(int i=0;i<arr.length;i++){
            if(target<arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
