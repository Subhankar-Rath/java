public class pratice1 {
    public static void occurence(int n,int arr[],int key){
        if(n==arr.length){
            return;
        }
        if(arr[n]==key){
            System.out.println(n);
        }
        occurence(n+1,arr, key);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        occurence(0, arr, 2);
    }
    
}
