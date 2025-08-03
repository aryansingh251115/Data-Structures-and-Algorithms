class Solution {
    public List<String> addOperators(String num, int target) {
        // Map<String,Integer>  hm = new HashMap<>();
        // hm.put('+' , 1);
        // hm.put('-' , 2);
        // hm.put('*' , 3);
        List<String> ans = new ArrayList<>();
        helper(0, target, num,ans , "" , 0,0);
        return ans;
    }

    private void helper(int idx, int target, String num, List<String> ans, String temp,long tempAns, long prev) {
        if (idx == num.length()) {
            if (tempAns == target) {
                ans.add(temp);
            }
            return;
        }

        for (int i = idx; i < num.length(); i++) {
            if (i != idx && num.charAt(idx) == '0')
                break;

            String currStr = num.substring(idx, i + 1);
            long numAns = Long.parseLong(currStr);

            if (idx == 0) {
                helper(i + 1, target, num, ans, currStr , numAns,numAns);

            } else {
                helper(i + 1, target, num, ans, temp + '+' + currStr, tempAns + numAns,numAns);
                helper(i + 1, target, num, ans, temp + '-' + currStr, tempAns - numAns,-numAns);
                helper(i + 1, target, num, ans, temp + '*' + currStr , tempAns - prev + prev * numAns,prev*numAns);

            }

           

        }

    }
}
