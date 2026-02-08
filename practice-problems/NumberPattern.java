public class NumberPattern {
    public static void pattern(int n,int m){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(counter+"\t");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(3, 4);
    }
}
