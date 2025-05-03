class Solution {
    public List<List<Integer>> combinationSum2(int[] candi, int target) {
        Arrays.sort(candi);
        List<List<Integer>> lst = new ArrayList<>();
        helper(lst,0,candi,target,new ArrayList<>());
        return lst;
    }

    private void helper(List<List<Integer>> lst , int idx ,int candi[], int target , List<Integer> temp){
        if(target == 0){
            lst.add(new ArrayList<>(temp));
            return;
        }

        if(target < 0){
            // lst.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx ; i<candi.length ; i++){
            if(i>idx && candi[i-1] == candi[i]){
                continue;
            }
            int val = candi[i];
            temp.add(val);
            helper(lst,i+1,candi,target - val,temp);
            temp.remove(temp.size()-1);
        }
    }
}