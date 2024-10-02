class Solution {
    public int maxFrequencyElements(int[] nums) {
        // since constraints are very less so we can use array instead of hashmap
        int arr[] = new int[101];
        int max = 0;
        int totalfreq= 0 ;
        for(int i =0;i<nums.length;i++){
            arr[nums[i]] = arr[nums[i]]+1;
            if(arr[nums[i]]>max){
                max = arr[nums[i]];
                totalfreq = 0;
                totalfreq +=max;
            }
            else if(arr[nums[i]] == max){
                totalfreq += max;
            }
        }
    return totalfreq;
    }
}













// //done without any help
// // but tc is not good  i.e done in three passes with O(n)
// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int i:nums){
//             hm.put(i,hm.getOrDefault(i,0)+1);
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i : hm.values()){
//             max = Math.max(max,i);
//         }
//         int tot_freq = 0;
//         for(int i : hm.values()){
//             if(i==max){
//                 tot_freq +=i;
//             }
//         }
//     return tot_freq;
//     }
// }


