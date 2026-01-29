public class InvertedHalfPyramidNo {
    public static void pattern_number(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern_number(5);
    }
    
}
