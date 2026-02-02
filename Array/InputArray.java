package Array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int arr[]= new int[100];
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        System.out.println("phy"+arr[0]);
        System.out.println("che"+arr[1]);
        System.out.println("mth"+arr[2]);
        
        int percentage=(arr[0]+arr[1]+arr[2])/3;
        System.out.println("percentage"+percentage+"%");

        System.out.println(arr.length);//dot operator
    }
}
