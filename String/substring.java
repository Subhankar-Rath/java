public class substring {
    public static String subString(String str,int s,int e){
        String sub="";
        for(int i=s;i<e;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.print(str.substring(0,5));
        // System.out.println(subString(str, 0, 5));
    }
}
