public class SumOfnNo {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum1=n+sum(n-1);
        return sum1;
    }
    public static void main(String a[]){
        int n=5;
        System.out.println(sum(n));
    }
    
}
