class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int i =0;
        int j =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                min = nums1[i]<min? nums1[i]:min;
                i++;
                j++;
            }
        }
        min = min==Integer.MAX_VALUE? -1:min;
    return min;
    }
}