public class Practice3 {
    public static int count(String str,int n){
        int math=0;
        if(n==str.length()){
            return 0;
        }
        
        return 1+count(str,n+1);
        
    }
    public static void main(String args[]){
        System.out.println(count("subhankar",0));
    }
}
