public class Fibonacci {
    public static int f(int n){
        if(n==0||n==1){
            return n;
        }
        int fn=f(n-1)+f(n-2);
        return fn;
    }
    public static void main(String a[]){
        System.out.println(f(5));
    }
}
