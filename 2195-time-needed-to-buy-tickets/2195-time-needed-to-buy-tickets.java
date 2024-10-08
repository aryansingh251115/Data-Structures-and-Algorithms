class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while(tickets[k]>0){
            for(int i = 0;i<tickets.length;i++){
                if(tickets[i]>0){
                    tickets[i]--;
                    time++;
                }

                if(tickets[k] == 0 ){
                    return time;
                }
            }
        }
    return time;
    }
}



/*

Approach -1 

Simply simulate using queue 



Approach 2 - using arrays

Iterate through whole array and decrease each element by 1 each time and increse the time by
one each time,until the concerned element becomes zero.


*/

