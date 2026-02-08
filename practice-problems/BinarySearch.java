public class BinarySearch {
    public static int binary(int number[],int key){
        int start=0,end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==key){
                return mid;
            }
            if(mid<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6};
        int key=5;
        int x=binary(number, key);
        if(x==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("index is"+x);
        }
    }
}
