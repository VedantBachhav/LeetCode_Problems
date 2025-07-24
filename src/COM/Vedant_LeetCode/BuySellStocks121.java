package COM.Vedant_LeetCode;
import  java.util.*;

//problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

//note: paste function code and remove static from function
public class BuySellStocks121 {
    public static void main(String[] args) {
        int[] prices = {1, 6};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
//        int buy = prices[0];
//        int buying = 0;
//        int sell = prices[prices.length ], selling = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (buy > prices[i]) {
//                buy = prices[i];
//                buying = i;
//            } else if (sell < prices[i] && buy < sell) {
//                sell = prices[i];
//                selling = i;
//            }
//        }
//        if (buying < selling) {
//            return selling+1;
//        }
//
//        return 0;

        // copy from here

        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i =0; i<prices.length; i++){
            if(buyprice<prices[i]){
                int profit= prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;

    }
}