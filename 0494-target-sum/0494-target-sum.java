class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans[] = new int[1];
        helper(nums, target, 0,0,ans);
        return ans[0];

    }

    private void helper(int nums[], int target, int idx, int temp, int ans[]) {
        if (idx == nums.length) {
            if (temp == target) {
                ans[0]++;
                return;
            } 
            return;
        }      
        helper(nums, target, idx+1, temp+nums[idx], ans);
        helper(nums, target, idx+1, temp-nums[idx], ans);
        
    }
}