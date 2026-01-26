import java.util.Scanner;

public class palindrome {
    public static boolean palindrom(int n){
        int pan=n;
        int rev=0;
        while(pan!=0){
            int rem=pan%10;
            rev=rev*10+rem;
            pan/=10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(palindrom(n)){
            System.out.println("palindrome hee yee");
        }
        else{
            System.out.println("dhoke me hee tu");
        }
    }
}
