class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        int count= 0 ;
        for(int i = 0 ;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        return helper(board , count, 0);

    }
    private int helper(char[][] board, int count, int row){
        if(row == board.length){
            count++;
            return count;
        }
        for(int j = 0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                count = helper(board,count,row+1);
                board[row][j] = '.';
            }
        }
    return count;
    }

    private boolean isSafe(char board[][],int row,int col){

        //Checking for the vertical up direction
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        
        //Checking for the left diagonal direction
        for(int i = row-1 ,j = col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        
        //Checking for the right diagonal direction
        for(int i = row, j = col ; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
    return true;
    }
}