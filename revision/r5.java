package revision;
import java.util.*;
public class r5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       char target = sc.next().charAt(0);
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=target){
                result+=ch;
            }
        }
        System.err.println(result); 

    }
}
