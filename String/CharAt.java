package String;

public class CharAt {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName="subhankar";
        String lastName ="Rath";
        String fullName=firstName+" "+lastName;
        printLetter(fullName);
    }
    
}
