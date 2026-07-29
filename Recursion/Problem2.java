public class Problem2 {
    public static void printInc(int n){
        if(n==1){
            System.out.println(n+" ");

            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String a[]){
        int n=5;
        printInc(n);
    }
}
