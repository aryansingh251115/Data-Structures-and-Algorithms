class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lst = new ArrayList<>();
        char board[][] = new char[n][n];
        for (int i =0 ;i<board.length;i++) {
            Arrays.fill(board[i],'.'); //initialsation of an array
        }
        helper(board,0,lst);
        return lst;
    }

    private void helper(char board[][], int row, List<List<String>> lst) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i<board.length;i++) {
                temp.add(new String(board[i]));
            }
            lst.add(temp);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                helper(board, row + 1, lst);
                board[row][j] = '.';
            }

        }
    }

    private boolean isSafe(char[][] board, int row ,int col){
        //checking vertical
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //checking right diagonal
        for(int i = row-1 , j = col+1 ; i>=0 &&  j<board.length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        
        //checking left diagonal
        for(int i = row-1 , j = col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
    return true;
    }
}