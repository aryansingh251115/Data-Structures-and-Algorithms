class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];  // Store the max sum found
        int temp = nums[0]; // Store the current ascending sum

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){  // Continue ascending sequence
                temp += nums[i];
            } else {  // Reset when sequence breaks
                sum = Math.max(sum, temp);
                temp = nums[i];
            }
        }
        
        return Math.max(sum, temp); // Ensure max sum is returned
    }
}
