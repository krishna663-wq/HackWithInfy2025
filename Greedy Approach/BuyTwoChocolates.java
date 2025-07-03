
import java.util.Arrays;

public class BuyTwoChocolates {
    public static int buyChoco(int[] prices, int money) {
        
        Arrays.sort(prices);
        
        int total = prices[0] + prices[1];

        if(total <= money) return money-total;
        else return money;
        
    }

    public static void main(String[] args) {
        int[] prices = {3, 2, 3};
        int money = 3;
        System.out.println(buyChoco(prices, money));  // Output: 0
    }
}

