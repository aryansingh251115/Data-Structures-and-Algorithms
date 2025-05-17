class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lst = new ArrayList<>();
        helper(s, lst, new ArrayList<>(), 0);
        return lst;
    }

    private void helper(String s, List<List<String>> lst, List<String> temp, int idx) {
        if (idx >= s.length()) {
            lst.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s.substring(idx,i+1))) {
                temp.add(s.substring(idx, i+1));
                helper(s, lst, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if(s == "" || s == null){
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}