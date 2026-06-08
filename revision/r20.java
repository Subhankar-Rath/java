public class r20 {
    public static void main(String arggs[]){
        int arr[]={4, 8, 10, 12, 15};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
