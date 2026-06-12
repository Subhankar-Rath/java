import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
        //anagram is something that is compare character of the strings
       String s1="race";
       String s2="care";
       if(s1.length()!=s2.length()){
        System.out.println("not an anagram");
       }
       char[] arr1=s1.toCharArray();
       char[] arr2=s2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);
    //    if(Arrays.equals(arr1,arr2)){
    //     System.out.println("anagram");
    //    }
    //    else{
    //     System.out.println("not anagram");
    //    }


    //alternative
    boolean flag=true;
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]){
            System.out.println("not anagram");
            break;
        }
        else{
            System.out.println("anagram");
            break;
        }
    }
    }
}
