class Solution {
    public int[][] divideArray(int[] nums, int d) {
        // Step 1: Sort the input array to make it easier to form groups
        Arrays.sort(nums);

        // Step 2: Initialize the length of the array and a 2D array to store the result
        int n = nums.length;
        int arr[][] = new int[n / 3][3]; // Each row represents a group of 3 elements

        int k = 0; // Variable to track position in the sorted nums array

        // Step 3: Check if each group of 3 consecutive elements satisfies the condition
        for(int i = 0; i < nums.length - 2; i = i + 3) {
            // If the difference between the largest and smallest element in the group is > d, return empty array
            if(nums[i + 2] - nums[i] > d) {
                return new int[0][0];
            }
        }

        // Step 4: Fill the 2D array with valid groups of 3 elements
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                // Insert elements from the sorted array into each group
                arr[i][j] = nums[k];
                k++; // Move to the next element in the sorted nums array
            }
        }

        // Step 5: Return the 2D array containing the groups
        return arr;
    }
}
