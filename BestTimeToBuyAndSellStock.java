// File: BestTimeToBuyAndSellStock.java
import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Minimum price ko initially maximum value pe set kiya
        int maxProfit = 0;                // Maximum profit initially 0

        for (int price : prices) {        // Har price pe loop chalega
            if (price < minPrice) {       // Agar current price sabse chhota hai
                minPrice = price;         // minPrice ko update karenge
            } else {                      // Agar current price zyada hai
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;                 // Final maximum profit return karenge
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
        
        sc.close(); // Scanner close karna best practice hai
    }
}
