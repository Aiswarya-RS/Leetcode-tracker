// Last updated: 09/07/2026, 09:16:37
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int j = 0; j < c; j++) {
            int max = Integer.MIN_VALUE;

            // 1. Find max in column j
            for (int i = 0; i < r; i++) {
                if (matrix[i][j] != -1) {
                    max = Math.max(max, matrix[i][j]);
                }
            }

            // 2. Replace all -1 with max
            for (int i = 0; i < r; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max;
                }
            }
        }

        return matrix;
    }
}