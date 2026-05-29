class Solution {
    public void setZeroes(int[][] matrix) {
        int rowln = matrix.length;
        int colln = matrix[0].length;
        boolean row[] = new boolean[rowln];
        boolean col[] = new boolean[colln];
        for (int i = 0; i < rowln; i++) {
            for (int j = 0; j < colln; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < rowln; i++) {
                for (int j = 0; j < colln; j++) {
                    if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }

            }
        }

    }
}