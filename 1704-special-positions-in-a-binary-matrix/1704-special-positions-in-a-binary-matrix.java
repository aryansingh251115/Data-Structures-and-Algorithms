class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isSpecial(mat,i,j)) {
                    count++;
                }
            }
        }
    return count;
    }

    private boolean isSpecial(int mat[][] , int row,int col){
        return checkrow(mat,row,col) && checkcol(mat,row,col);

    }
    private boolean checkcol(int mat[][], int row,int col) {
        for (int i = 0; i < mat.length; i++) {
            if(i!=row && mat[i][col] == 1){
                return false;
            }
        }
    return true;
    }

    private boolean checkrow(int mat[][], int row,int col) {
        for (int i = 0; i < mat[0].length; i++) {
            if(i!=col && mat[row][i] == 1){
                return false;
            }
        }
    return true;
    }
}