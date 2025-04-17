class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(candidates);
        helper(lst, candidates, 0, new ArrayList<Integer>(), target);
        return lst;

    }

    private void helper(List<List<Integer>> lst, int arr[], int idx, List<Integer> path, int target) {
        if (target == 0) {
            lst.add(new ArrayList<>(path));
            return;
        }
        if (idx >= arr.length || target < 0) {
            return;
        }
        // helper(lst, arr, idx + 1, path, target); //Excluding 
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

        path.add(arr[i]);
        helper(lst, arr, i + 1, path, target - arr[i]); //Including
        path.remove(path.size() - 1);
        }
    }
}