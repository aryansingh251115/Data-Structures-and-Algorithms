class Solution {
    public int[][] divideArray(int[] nums, int d) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr[][] = new int[n / 3][3];
        int k = 0;
        for(int i =0;i<nums.length-2;i=i+3){
            if(nums[i+2]- nums[i]>d){
                return new int[0][0];
            }
        }

        for(int i =0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j] = nums[k];
                k++;
            }
        }
    return arr;
    }
}