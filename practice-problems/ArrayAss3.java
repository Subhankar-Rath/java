import java.util.*;
public class ArrayAss3 {
    public static int sell(int num[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<buyPrice){
                // [7, 1, 5, 3, 6,  4]
                buyPrice=num[i];
            }
            else{
            profit=num[i]-maxProfit;
            maxProfit=Math.max(profit,maxProfit);
            }
        }
        if(maxProfit>0){
            return maxProfit;
        }
        return 0;
    }
    public static void main(String[] args) {
        int num[]={7, 1, 5, 3, 6,  4};
        System.out.println(sell(num));
    }
}
