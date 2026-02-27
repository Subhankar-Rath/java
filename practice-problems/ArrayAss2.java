public class ArrayAss2 {
    public static int find(int num[],int target){
        for(int i=0;i<num.length;i++){
            if(target==num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(find(num, target));
    }
}
