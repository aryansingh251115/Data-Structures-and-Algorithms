class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        helper(lst, n, new StringBuilder(), 0, 0);
        return lst;
    }

    private void helper(List<String> lst, int n, StringBuilder temp, int opening, int closing) {
        if (temp.length() == 2 * n) {
            lst.add(temp.toString());
            return;
        }
        if(opening < n){
            temp.append('(');
            helper(lst,n,temp,opening+1,closing);
            temp.deleteCharAt(temp.length()-1);
        }

        if(closing < opening){
            temp.append(')');
            helper(lst,n,temp,opening,closing+1);
            temp.deleteCharAt(temp.length()-1);
        }
        
    }
}