public class r13 {
    public static void main(String args[]){
        int arr[]={10, 25, 15, 40, 20};
        int maxDiff=arr[0];
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i+1]-arr[i]);
            if(maxDiff<diff){
                maxDiff=diff;
            }
        }
        System.out.println(maxDiff);
    }
}
