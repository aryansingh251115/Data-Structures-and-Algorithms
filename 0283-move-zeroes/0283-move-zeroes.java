class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                // int temp = nums[i];
                // nums[i] = nums[left];
                // nums[left] = temp;
                nums[i] = nums[left] + nums[i]  - (nums[left] = nums[i]);
                left++;
            }
        }
    }
}