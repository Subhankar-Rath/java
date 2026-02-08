public class LargestSmallest {
    public static int largesmall(int arr[]){
        //largest
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            largest=arr[i];
        }
        //smallest
        int smallest=arr[0];
        for(int j=0;j<arr.length;j++){
            smallest=arr[j];
        }
        System.out.println("smallest"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("largest"+largesmall(arr));
    }
}
