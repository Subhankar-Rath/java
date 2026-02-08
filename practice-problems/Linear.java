public class Linear {
    public static int binary(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        int key=4;
        int x=binary(number, key);
        if(x==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("index is"+x);
        }
    }
}
