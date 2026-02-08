public class Reverse {
    //{1,2,4,5}
    public static void reverse(int number[]){
        int start=0,end=number.length-1;
        while(start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(" "+number[i]);
        }
    }
}
