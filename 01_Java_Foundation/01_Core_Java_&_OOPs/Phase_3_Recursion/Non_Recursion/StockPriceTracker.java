/*Let's make the last void problem a little different. Instead of simply classifying every element, you'll need to compare consecutive values.

Stock Price Movement Tracker

A company's stock price for 7 consecutive days is:

int[] prices = {100, 105, 103, 110, 110, 107, 115};

Create:

public static void analyzePrices(int[] prices)

For each day starting from Day 2, compare the price with the previous day.

The rules are:

Current price > Previous price
→ Price Increased

Current price < Previous price
→ Price Decreased

Current price == Previous price
→ No Change

For example:

Day 1: $100 - Starting Price

Day 2: $105 - Price Increased
Day 3: $103 - Price Decreased
Day 4: $110 - Price Increased
Day 5: $110 - No Change
Day 6: $107 - Price Decreased
Day 7: $115 - Price Increased

At the end, print:

Increase Days: ?
Decrease Days: ?
No Change Days: ? */
public class StockPriceTracker {

    public static void analyzePrices(int[] prices) {

        int increase = 0;
        int decrease = 0;
        int noChange = 0;

        // Day 1 has no previous day to compare with
        System.out.println("Day 1: $" + prices[0] + " - Starting Price");

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {

                System.out.println(
                    "Day " + (i + 1) + ": $" + prices[i] + " - Price Increased"
                );

                increase++;

            } else if (prices[i] < prices[i - 1]) {

                System.out.println(
                    "Day " + (i + 1) + ": $" + prices[i] + " - Price Decreased"
                );

                decrease++;

            } else {

                System.out.println(
                    "Day " + (i + 1) + ": $" + prices[i] + " - No Change"
                );

                noChange++;
            }
        }

        System.out.println();
        System.out.println("Increase Days: " + increase);
        System.out.println("Decrease Days: " + decrease);
        System.out.println("No Change Days: " + noChange);
    }

    public static void main(String[] args) {

        int[] prices = {100, 105, 103, 110, 110, 107, 115};

        analyzePrices(prices);
    }
}
