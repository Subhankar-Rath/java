import java.util.Scanner;
public class DivisorDigit {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int n1 = n;
        int c = 0;
        
        while (n1 > 0) 
        {
            int d = n1 % 10;
            if (d != 0 && n % d == 0) 
            {
                c++;
            }
            n1 = n1/10;
        }
        System.out.println(c);
        sc.close();
    }
}