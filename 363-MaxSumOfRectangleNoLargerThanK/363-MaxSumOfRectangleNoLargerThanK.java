// Last updated: 09/07/2026, 09:18:49
class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;

        // Fix left column
        for (int left = 0; left < n; left++) {
            int[] rowSum = new int[m];

            // Fix right column
            for (int right = left; right < n; right++) {

                // Add current column values to rowSum
                for (int i = 0; i < m; i++) {
                    rowSum[i] += matrix[i][right];
                }

                // Now find max subarray sum <= k
                for (int start = 0; start < m; start++) {
                    int sum = 0;
                    for (int end = start; end < m; end++) {
                        sum += rowSum[end];
                        if (sum <= k) {
                            max = Math.max(max, sum);
                        }
                    }
                }
            }
        }
        return max;
    }
}
