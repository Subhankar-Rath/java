public class r10 {
     public static int arrayC(int num[]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
    public static void main(String a[]){
        int num[]={1,2,3,4,5};
        System.out.println(arrayC(num));
    }
}
