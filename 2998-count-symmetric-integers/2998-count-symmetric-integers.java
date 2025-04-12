class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i < high + 1; i++) {
            if (helper(i)) {
                ans++;
            }
        }
        return ans;
    }

    private boolean helper(int num) {
        boolean ans = true;
        String str = Integer.toString(num);
        if (str.length() % 2 != 0) {
            return false;
        }
        int mid = str.length() / 2;
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < mid; i++) {
            int temp = str.charAt(i) - '0';
            firstHalf += temp;
        }
        for (int i = mid; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';
            secondHalf += temp;
        }
        return firstHalf == secondHalf;
    }
}