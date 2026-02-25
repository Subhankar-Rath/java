package Array;
import java.util.*;
public class BuySellStock {
    public static int buysellstock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String ags[]){
        int prices[]={7,1,5,3,16,4};
        System.out.println(buysellstock(prices));
    }
}
