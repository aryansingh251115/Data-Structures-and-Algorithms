class Solution {
    public int countPairs(int[] nums, int k) {
        return helper(nums,k,0);
    }
    private int helper(int arr[] ,int  k , int idx){
        if(idx == arr.length){
            return 0;
        }
        int count= 0;
        for(int j = idx+1;j<arr.length;j++){
            if(arr[idx] == arr[j] && idx*j%k ==0){
                count++;
            }
        }
        return count+ helper(arr,k ,idx+1);
    }
}