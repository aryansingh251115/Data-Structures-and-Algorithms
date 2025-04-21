class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        if (m * n < word.length()) return false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, int i, int j, String word, int idx) {
        int m = board.length;
        int n = board[0].length;

        // Boundary check and character match check
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(idx)) {
            return false;
        }

        // All characters matched
        if (idx == word.length() - 1) return true;

        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited

        int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

        for (int[] dir : directions) {
            int newI = i + dir[0];
            int newJ = j + dir[1];

            if (find(board, newI, newJ, word, idx + 1)) {
                return true;
            }
        }

        board[i][j] = temp; // Backtrack
        return false;
    }
}
