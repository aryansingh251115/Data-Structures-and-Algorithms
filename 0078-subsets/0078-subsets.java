class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        helper(lst,new ArrayList<>(),0,nums);
        return lst;
    }

    private void helper(List<List<Integer>> lst ,List<Integer> temp,int idx,int nums[]){
        if(idx == nums.length){
            lst.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);          //including current element in the ans
        helper(lst,temp,idx+1,nums);
        temp.remove(temp.size()-1);
        helper(lst,temp, idx+1,nums);
        
    }
}