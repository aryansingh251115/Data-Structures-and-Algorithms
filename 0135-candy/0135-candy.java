class Solution {
    public int candy(int[]rate ) {
        int ans = 0 ;
        int temp[] = new int[rate.length];
        Arrays.fill(temp,1);
        //we are going from left to right 
        for(int i = 1;i<rate.length;i++){
            if(rate[i-1] < rate[i])
            temp[i] = temp[i-1]+1;
        }

        for(int i = temp.length-2;i>=0;i--){
            if(rate[i]>rate[i+1]){
                temp[i] = Math.max(temp[i] , temp[i+1] +1);
            }
        }
        for(int i :temp) ans+=i;
    return ans;
    }


}