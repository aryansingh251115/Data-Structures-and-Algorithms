class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans[] = new int[1];
        helper(nums, target, 0,0,ans,1);
        return ans[0];

    }

    private void helper(int nums[], int target, int idx, int temp, int ans[],int sign) {
        if (idx == nums.length) {
            if (temp == target) {
                ans[0]++;
                return;
            } 
            return;
        }
        // temp += nums[idx]*sign;        
        helper(nums, target, idx+1, temp+nums[idx], ans,1*sign);
        // temp -= nums[idx]*sign;
        helper(nums, target, idx+1, temp-nums[idx], ans,-1*sign);
        
    }
}