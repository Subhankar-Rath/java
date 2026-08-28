public class Practice2 {
    public static void printDigit(int n){
        if(n==0){
            return;
        }
        printDigit(n/10);
        int digit=n%10;
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print(words[digit]+" ");
    }
    public static void main(String[] args) {
        printDigit(1947);
    }
}
