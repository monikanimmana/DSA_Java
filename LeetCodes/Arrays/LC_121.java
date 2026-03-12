package LeetCode.LeetCodes.Arrays;

public class LC_121 {
    public void Best_Sell_and_Buy(){
        int prices[] = new int[]{7,3,2,1,5};
        int min_price = Integer.MAX_VALUE;
        int final_p = 0;
        for( int price : prices){
                if(price < min_price){
                    min_price = price;
                }
                int profit = price - min_price;
                if( profit > final_p){
                    final_p = profit;
                }
            }
            System.out.println(final_p);
        }
        public static void main(String[] args) {
            LC_121 obj = new LC_121();
            obj.Best_Sell_and_Buy();
            
        }
    }

