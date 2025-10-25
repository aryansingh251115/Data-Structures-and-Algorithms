
class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        long ans = 1;
        int last = nums2[nums2.length-1];
        int diff = Integer.MAX_VALUE;
        for(int i = 0;i<nums1.length;i++){          
            ans += Math.abs(nums1[i] - nums2[i]);
        }


        for(int i =0 ;i<nums1.length;i++){
            int low = Math.min(nums1[i] , nums2[i]);
            int high = Math.max(nums1[i] , nums2[i]);

            if(last < low){
                diff = Math.min(diff , low - last);
            }
            else if(last > high){
                diff = Math.min(diff , last - high);
            }else{
                diff = 0;
            }
        }

        ans += diff;

        return ans;
        
    }
}