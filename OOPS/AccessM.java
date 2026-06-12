package OOPS;

public class AccessM {
    public static void main(String a[]){
        BankAccount ac=new BankAccount();
        ac.userName="subhankarrath";
        ac.setPassword("abcdefghi");
    }
}
class BankAccount{
    public String userName;
    private String password;
    public void setPassword(int password){
        password=pwd;
    }
}
