//my approach - O(n logn)

// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int total = prices[0] + prices[1];
//         if(total <= money){
//             return money- total;
//         }
//         else{
//             return money;
//         }
//     }
// }


//My another approach

class Solution {
    public int buyChoco(int[] prices, int money) {
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for(int i =0 ;i<prices.length;i++){
            if(prices[i]<smallest){
                smallest2 = smallest;
                smallest = prices[i];
            }
            else if(prices[i]<smallest2){
                smallest2 = prices[i];
            }
        }
        if(smallest +smallest2 <= money){
            return money - smallest -smallest2;
        }
        else{
            return money;
        }
    }
}