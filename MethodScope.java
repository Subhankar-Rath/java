public class MethodScope {
    public static void prints(){
        // int x=s; as the variable is declared below the line the compiler can not assign the value of s to x
        int s=10;
        System.out.println(s);
    }
    public static void main (String args[]){
        // System.out.println(s); you can not directly use the variable without using the dunction name
        prints();
    }
    
}
