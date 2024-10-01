class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int i : hm.values()){
            max = Math.max(max,i);
        }
        int tot_freq = 0;
        for(int i : hm.values()){
            if(i==max){
                tot_freq +=i;
            }
        }
    return tot_freq;
    }
}