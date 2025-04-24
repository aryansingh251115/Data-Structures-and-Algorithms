class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefix = 0;
        hm.put(0,1);
        for(int i : nums){
            prefix += i;
            if(hm.containsKey(prefix-k))count += hm.get(prefix-k);
            // hm.getOrDefault(prefix-k, 0);
            hm.put(prefix,hm.getOrDefault(prefix,0)+1);

        }
    return count;
    }
}