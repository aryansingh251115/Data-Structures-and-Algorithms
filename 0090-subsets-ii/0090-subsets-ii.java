class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), lst);
        return lst;
    }

    private void helper(int nums[], int idx, List<Integer> temp, List<List<Integer>> lst) {
        lst.add(new ArrayList<>(temp));

        for (int i = idx; i < nums.length; i++) {
            //exclude
            // helper(nums, idx + 1, temp, lst);
            if(i>idx && nums[i] == nums[i-1]){
                continue;
            }
            //include
            temp.add(nums[i]);
            // lst.add(new ArrayList<>(temp));
            helper(nums, i + 1, temp, lst);
            temp.remove(temp.size() - 1);
        }

    }
}