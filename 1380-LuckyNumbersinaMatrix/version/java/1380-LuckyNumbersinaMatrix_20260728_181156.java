// Last updated: 28/07/2026, 18:11:56
1class Solution {
2    public List<Integer> luckyNumbers (int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        
6        int[] row_minimums = new int[rows];
7        Arrays.fill(row_minimums, Integer.MAX_VALUE);
8        int[] col_maximums = new int[cols];
9        
10        for (int row_ind = 0; row_ind < rows; ++row_ind) {
11            for (int col_ind = 0; col_ind < cols; ++col_ind) {
12                int el = matrix[row_ind][col_ind];
13                row_minimums[row_ind] = Math.min(row_minimums[row_ind], el);
14                col_maximums[col_ind] = Math.max(col_maximums[col_ind], el);
15            }
16        }
17        
18        for (int row_ind = 0; row_ind < rows; ++row_ind) {
19            for (int col_ind = 0; col_ind < cols; ++col_ind) {
20                int el = matrix[row_ind][col_ind];
21                if (el == row_minimums[row_ind] && el == col_maximums[col_ind]) {
22                    return Collections.singletonList(el);
23                }
24            }
25        }
26        
27        return Collections.emptyList();
28    }
29}