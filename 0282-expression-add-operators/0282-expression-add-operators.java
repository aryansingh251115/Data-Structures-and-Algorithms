class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> lst = new ArrayList<>();
        helper(lst, num, target, 0, "", 0, 0);
        return lst;
    }

    private void helper(List<String> lst, String num, int target, int idx, String temp, long numTemp, long prev) {
        if (idx == num.length()) {
            if (numTemp == target) {
                lst.add(temp);
            }
            return;
        }

        for (int i = idx; i < num.length(); i++) {
            // Skip numbers with leading zeros
            if (i != idx && num.charAt(idx) == '0') break;

            String currStr = num.substring(idx, i + 1);
            long val = Long.parseLong(currStr);

            if (idx == 0) {
                // First number, so no operator
                helper(lst, num, target, i + 1, currStr, val, val);
            } else {
                helper(lst, num, target, i + 1, temp + "+" + currStr, numTemp + val, val);
                helper(lst, num, target, i + 1, temp + "-" + currStr, numTemp - val, -val);
                helper(lst, num, target, i + 1, temp + "*" + currStr, numTemp - prev + prev * val, prev * val);
            }
        }
    }
}
