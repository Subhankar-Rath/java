package String;

public class CharAt1 {
    public static boolean ispalindrom(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }    
    public static void main(String args[]){
        String fn="subhankar";
        String ln="rath";
        String fullName=fn+ln;
        ispalindrom(fullName);
    }

}
