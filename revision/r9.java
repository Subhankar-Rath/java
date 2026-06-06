public class r9{
    public static int arrayC(int num[]){
        int small=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<small){
                small=num[i];
            }
        }
        return small;
    }
    public static void main(String a[]){
        int num[]={1,2,3,4,5};
        System.out.println(arrayC(num));
    }    
}
