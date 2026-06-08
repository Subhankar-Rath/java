import java.util.Scanner;
public class r17{
    public static void main(String args[]){
        int arr[]={5,2,8,2,10};
        int index=-1;
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println(index);
    }
}