class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int pairs = 0;
        int i =0;
        int j =0;
        long count = 0;
        while(j<nums.length){
            pairs += hm.getOrDefault(nums[j],0);  
            hm.put(nums[j], hm.getOrDefault(nums[j],0)+1);

            while(pairs>= k){              //valid condition
                count += nums.length - j;
                hm.put(nums[i],hm.get(nums[i])-1);
                pairs -= hm.get(nums[i]); 
                i++;
            }
            j++;
        }
       
    return count;
    }
}