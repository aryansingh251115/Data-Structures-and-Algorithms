//my approach but having TC - O(n log n)
// class Solution {
//     public int maxProductDifference(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length-1]*nums[nums.length-2] - nums[0]*nums[1];
//     }
// }


//mike's approach
class Solution {
    public int maxProductDifference(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest2 = largest;
                largest = nums[i];

            }
            else  if(nums[i]>largest2){
                largest2 = nums[i];
            }
            if(nums[i] < smallest){
                smallest2 = smallest;
                smallest = nums[i];
            }
            else if(nums[i]<smallest2){
                
                smallest2 = nums[i];
            }
        }
        return largest*largest2 - smallest*smallest2;

    }
}