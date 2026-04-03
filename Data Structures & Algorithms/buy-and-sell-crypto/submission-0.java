class Solution {
    public int maxProfit(int[] prices) {
        List<Integer> list=new ArrayList<>();

  int curr_price=0;
  int max_profit=0;

  int buy=prices[0];
  
       for (int i = 1; i <prices.length; i++) {
            if(prices[i]<buy){
                buy=prices[i];
                
            }
            else{

                int profit=prices[i]-buy;
                max_profit=Math.max(max_profit,profit);
                

            }
        
    
}


        return max_profit;
    }
}
