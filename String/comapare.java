public class comapare {
    public static void main(String args[]){
        String s1="subhankar";
        String s2="subhankar";
        String s3= new String("subhankar");
        if(s1==s2){
            System.out.println("same");
        }
        else{
            System.out.println("diff");
        }
        if(s1==s3){
            System.out.println("same");

        }
        else{
            System.out.println("diff");
        }
        if(s1.equals(s3)){//function for checking the values
            System.out.println("same");
        }
        else{
            System.out.println("diff");
        }
    }


}
