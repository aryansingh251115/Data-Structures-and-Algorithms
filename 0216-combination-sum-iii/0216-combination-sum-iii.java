class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lst = new ArrayList<>();
        helper(lst, new ArrayList<>(),1,k,n);
        return lst;
    }

    private void helper(List<List<Integer>> lst ,List<Integer> temp, int idx ,int digits, int target){
        if(temp.size() == digits && target == 0 ){
            lst.add(new ArrayList<>(temp)); 
            return;
        }
        else if(temp.size() == digits){
            return;
        }
        if(idx>9){
            return;
        }
        temp.add(idx);
        helper(lst,temp,idx+1,digits,target-idx);
        temp.remove(temp.size()-1);
        helper(lst,temp,idx+1,digits,target);

    }
}
