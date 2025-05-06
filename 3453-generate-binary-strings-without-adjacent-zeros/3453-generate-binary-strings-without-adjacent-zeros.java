class Solution {
    public List<String> validStrings(int n) {
        List<String> lst = new ArrayList<>();
        helper(n, new StringBuilder(), lst);
        return lst;
    }

    private void helper(int n, StringBuilder str, List<String> lst) {
        if (str.length() == n) {
            lst.add(new StringBuilder(str).toString());
            return;
        }
        str.append('1');
        helper(n, str, lst);
        str.deleteCharAt(str.length() - 1);
        if (str.length() == 0 || str.charAt(str.length() - 1) == '1') {
            str.append('0');
            helper(n, str, lst);
            str.deleteCharAt(str.length() - 1);

        }

    }

    private boolean count(StringBuilder str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return count >= 1 ? true : false;
    }
}