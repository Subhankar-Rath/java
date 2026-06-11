public class r29 {
    public static void main (String args[]){
        int arr[]={1,2,3,2,1};
        int afterSum=0;
        int beforeSum=0;
        for(int i=0;i<arr.length;i++){
            afterSum+=arr[i];
            int total=afterSum;
            if(beforeSum==afterSum){
                System.out.println(i);
            }
            else if(beforeSum!=afterSum){
                
            }
        }
    }
}
