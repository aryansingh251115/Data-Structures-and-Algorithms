class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0; // To count the number of content children
        
        // Sort both arrays to try to satisfy the children with the smallest greed factor first
        Arrays.sort(g); // Sort the greed factor array (children's greed levels)
        Arrays.sort(s); // Sort the size array (cookie sizes)

        int i = 0; // Pointer for cookies
        int j = 0; // Pointer for children

        // Iterate while both the cookies and children arrays have unprocessed elements
        while (i < s.length && j < g.length) {
            // If the current cookie can satisfy the current child
            if (s[i] >= g[j]) {
                count++; // Increase the count of content children
                i++; // Move to the next cookie
                j++; // Move to the next child
            } else {
                // If the current cookie can't satisfy the current child, try the next larger cookie
                i++;
            }
        }

        return count; // Return the total number of content children
    }
}
