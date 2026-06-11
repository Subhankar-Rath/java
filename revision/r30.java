import java.util.*;
public class r30 {
    public static void main(String args[]){
        String str="I am subhankar rath";
        String words[]=str.split(" ");
        String longest=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
