public class r15 {
    public static void main(String args[]){
        int arr[]={-5, 10, -2, 8, -1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
