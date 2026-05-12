public class comaparison {//comapreTo function is use for coampatre the character by character and also 'a'!='A'
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String fruit[]={"apple","mango","banana"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }

        }
        System.out.println(largest);

    }
}
