class Solution {
    public int findMaxLength(int[] nums) {
        int len = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(hm.containsKey(sum)){
                len = Math.max(len,i-hm.get(sum));
            }else{
                hm.put(sum , i);
            }
        }
    return len;
    }
}