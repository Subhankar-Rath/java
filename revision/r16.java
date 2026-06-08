public class r16 {
     public static void main(String args[]){
        int arr[]={-5, -2, 0, 8, 10};
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos=arr[i];
                break;
            }
        }
        System.out.print(pos);
    }
}
