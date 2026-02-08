

public class LargestIndex {
    public static int largestNo(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(final String[] args) {
        int number[]={1,2,3,4,5};
        System.out.println("largest"+largestNo(number));
        
    }
}
