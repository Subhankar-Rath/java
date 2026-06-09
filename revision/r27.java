public class r27 {
    public static void main(String args[]){
         int arr[] = {101, 105, 110, 115, 120};
        int target = 110;
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(target==arr[mid]){
                System.out.println("FOUND");
                break;
            }
            else if(mid<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            System.out.println("not found");
        }
    }
}
