public class SubArray {
    public static void subArray(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("("+number[i]+","+number[j]+")");
                }
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        subArray(number);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
