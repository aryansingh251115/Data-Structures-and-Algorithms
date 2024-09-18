class Solution {
    public int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length];
        for(int i =0 ;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(i!=j){
                    arr[j][i]= matrix[i][j] ;
                }
                else{
                     arr[i][j]=matrix[i][j] ;
                }
            }
        }
    return arr;
    }
}