package Array;
//the call by refenece means we have to declare the value of the array in the main function and call in the other funcction and if there is any changes in the main fuction array then it also shown in the other function
public class CallByRefernce {
    public static void update(int mark[],int unchangeable){
        for(int i=1;i<mark.length;i++){
            mark[i]+=1;
        }
    }
    public static void main(String[] args) {
        int mark[]={98,99,77};
        int unchangeable=5;
        update(mark, unchangeable);
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i]+" ");
        }
        System.out.println();
    }
}
