class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int sign = 1;
        int ans = 0;
        int idx = 0;
        if (s.charAt(idx) == '-' || s.charAt(idx) == '+') {
            sign = s.charAt(idx) == '+' ? 1 : -1;
            idx++;
        }
        while (idx < s.length()) {
            // if (s.charAt(0) == '+' || s.charAt(0) == '-')
            //     continue;
            if (Character.isDigit(s.charAt(idx))) {
                int temp = s.charAt(idx) - '0';
                if (ans > (Integer.MAX_VALUE - temp)/10) {
                    return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ans = ans * 10 + temp;
                idx++;
            } else {

                return (ans * sign);
            }

        }
        // if (ans > Integer.MAX_VALUE) {
        //     return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        // }
        return (ans * sign);
    }
}