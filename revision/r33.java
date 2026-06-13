public class r33 {
    public static void main(String args[]){
        int arr[]={2,8,3,10,5};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
