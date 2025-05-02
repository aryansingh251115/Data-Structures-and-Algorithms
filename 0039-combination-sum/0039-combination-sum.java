class Solution {
    public List<List<Integer>> combinationSum(int[] candi, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        if (candi.length == 0) {
            return lst;
        }
        helper(lst, candi, target, 0, new ArrayList<>());
        return lst;
    }

    private void helper(List<List<Integer>> lst, int candi[], int target, int idx, List<Integer> temp) {
        if (idx == candi.length) {
            if (target == 0) {
                lst.add(new ArrayList<>(temp));
                return;
            }
            return;
        }

        if(target < 0 ){
            return;
        }

        temp.add(candi[idx]);
        helper(lst, candi, target - candi[idx], idx, temp);
        temp.remove(temp.size() - 1);
        helper(lst, candi, target, idx + 1, temp);
    }
}