public class Binary {
    public static int binary(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        int key=4;
        binary(number, key);
    }
}
