class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> lst = new ArrayList<>();
        if (digits.length() == 0) {
            return lst;
        }
        Map<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        helper(digits, hm, 0, lst, new StringBuilder());

        return lst;
    }

    private List<String> helper(String digits, Map<Character, String> hm, int idx, List<String> lst,
            StringBuilder str) {
        if (idx == digits.length()) {
            lst.add(str.toString());
            return lst;
        }
        char c = digits.charAt(idx);
        String temp = hm.get(c);
        for (int i = 0; i < temp.length(); i++) {
            str.append(temp.charAt(i));
            helper(digits, hm, idx + 1, lst, str);
            str.deleteCharAt(str.length() - 1);
        }
        return lst;

    }
}