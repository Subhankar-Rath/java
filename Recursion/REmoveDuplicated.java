public class REmoveDuplicated {
    public static void removeDuplicated(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicated(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicated(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String []a){
        String str="appnnacollege";
        removeDuplicated(str,0,new StringBuilder(""),new boolean [26]);
    }
}
