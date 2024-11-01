class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrrow = new ArrayList<>();
        ArrayList<Integer> arrcol = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            arrrow.add(min);
            min = Integer.MAX_VALUE;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            arrcol.add(max);
            max = Integer.MIN_VALUE;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (arrrow.get(i) == matrix[i][j]  && matrix[i][j] == arrcol.get(j)) {
                    arr.add(arrrow.get(i));
                    break;
                }
            }

        }
        return arr;
    }
}