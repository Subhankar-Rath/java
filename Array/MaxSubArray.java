package Array;

public class MaxSubArray {
    public static void maxsubarray(int numbers[]){
        int maxarray=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxarray<currsum){
                    maxarray=currsum;
                }
            }
        }
        System.out.println("max sum="+maxarray);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        maxsubarray(numbers);
    }
}
