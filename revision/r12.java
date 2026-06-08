public class r12 {
    public static void arrayC(int num[]){
        int largest=num[0];
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
    }
}
