public class LOccurace {
    public static int lastOccurace(int [] arr, int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurace(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String a[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurace(arr,5,0));
    }
}
