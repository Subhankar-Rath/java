import java.util.Arrays;

public class r19 {
    public static void main(String args[]){
        int j=0;
        int arr[]={1,0,3,0,5,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
