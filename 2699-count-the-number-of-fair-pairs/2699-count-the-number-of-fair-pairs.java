class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans += upperBound(nums,i+1,nums.length-1,upper-nums[i]) - lowerBound(nums,i+1,nums.length-1,lower-nums[i]) +1;
        }
        return ans;
    }

    //finds the value >= target
    private int lowerBound(int nums[], int left, int right, int target) {
        int ans = right + 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
    return ans;
    }

    //finds the value <= target
    private int upperBound(int nums[], int left, int right, int target) {
        int ans = left- 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    return ans;
    }

}