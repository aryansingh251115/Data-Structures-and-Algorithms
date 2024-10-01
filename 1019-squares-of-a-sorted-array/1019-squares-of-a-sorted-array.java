//done without help but TC is very poor so not doing by that approach


//Here's the approach used in the question
// we use two pointer one at starting and other at ending and compare the squares of both
//numbers; whichever is greater will store in the resulatant array but at the end and that 
//pointer moves one forward or backward depending on the element

class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int arr[] = new int[nums.length];
        int k = nums.length-1;
        while(low <= high){
            if((nums[low]*nums[low]) >= (nums[high] * nums[high])){
                arr[k] = nums[low]*nums[low];
                low++;
                k--;
            }
            else{
                arr[k] = nums[high]*nums[high];
                k--;
                high--;
            }
        }
    return arr;
    }
}