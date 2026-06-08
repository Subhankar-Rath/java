public class r22 {
    public static void main(String arggs[]){
        int arr[]={10,20,30,40};
        int avg=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
           avg+=arr[i]/2;
           if(arr[i]>avg){
            count++;
           }
        }
        System.out.println(count);
}
}
