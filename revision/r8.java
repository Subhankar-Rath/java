public class r8 {
    public static int arrayC(int num[]){
        int large=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        return large;
    }
    public static void main(String a[]){
        int num[]={1,2,3,4,5};
        System.out.println(arrayC(num));
    }    
}
