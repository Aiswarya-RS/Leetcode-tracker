// Last updated: 28/08/2026, 13:52:49
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3    int width = obstacleGrid[0].length;
4    int[] dp = new int[width];
5    dp[0] = 1;
6    for (int[] row : obstacleGrid) {
7        for (int j = 0; j < width; j++) {
8            if (row[j] == 1)
9                dp[j] = 0;
10            else if (j > 0)
11                dp[j] += dp[j - 1];
12        }
13    }
14    return dp[width - 1];
15}
16}