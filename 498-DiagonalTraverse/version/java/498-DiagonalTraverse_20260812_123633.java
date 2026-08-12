// Last updated: 12/08/2026, 12:36:33
1public class Solution {
2    public int[] findDiagonalOrder(int[][] matrix) {
3        if (matrix == null || matrix.length == 0) return new int[0];
4
5        int m = matrix.length, n = matrix[0].length;
6        int[] result = new int[m * n];
7        int row = 0, col = 0;
8
9        for (int i = 0; i < m * n; i++) {
10            result[i] = matrix[row][col];
11
12            if ((row + col) % 2 == 0) {
13                if (col == n - 1) row++;
14                else if (row == 0) col++;
15                else { row--; col++; }
16            } else {
17                if (row == m - 1) col++;
18                else if (col == 0) row++;
19                else { row++; col--; }
20            }
21        }
22
23        return result;
24    }
25}