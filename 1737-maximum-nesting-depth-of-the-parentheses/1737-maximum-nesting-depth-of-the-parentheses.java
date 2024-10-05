class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int currval = 0;
        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                currval ++;
                res = Math.max(res,currval);
            }
            else if(c == ')'){
                currval--;
            }
        }
    return res;
    }
}