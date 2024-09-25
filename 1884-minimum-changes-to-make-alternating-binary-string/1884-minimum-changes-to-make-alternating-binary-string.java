class Solution {
    public int minOperations(String s) {
        int strt_with_0 = 0;  // Count of operations if we alternate starting with '0' (010101...)
        int strt_with_1 = 0;  // Count of operations if we alternate starting with '1' (101010...)

        // Counting operations for the pattern starting with '0' (i.e., "010101...")
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                // For even indices (0-based), we expect '0'
                if (s.charAt(i) != '0') {
                    strt_with_0++;  // If not '0', increment the count for necessary operation
                }
            } else {
                // For odd indices (1-based), we expect '1'
                if (s.charAt(i) != '1') {
                    strt_with_0++;  // If not '1', increment the count for necessary operation
                }
            }
        }

        // Counting operations for the pattern starting with '1' (i.e., "101010...")
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                // For even indices (0-based), we expect '1'
                if (s.charAt(i) != '1') {
                    strt_with_1++;  // If not '1', increment the count for necessary operation
                }
            } else {
                // For odd indices (1-based), we expect '0'
                if (s.charAt(i) != '0') {
                    strt_with_1++;  // If not '0', increment the count for necessary operation
                }
            }
        }

        // Return the minimum of the two patterns (either starting with '0' or '1')
        return Math.min(strt_with_0, strt_with_1);
    }
}
