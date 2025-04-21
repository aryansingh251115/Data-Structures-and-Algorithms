class Solution {
    public int maximumPossibleSize(int[] nums) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i :nums){
            if(st.isEmpty() || st.peek()<=i){
                st.push(i);
            }
        }
    return st.size();
    }
}