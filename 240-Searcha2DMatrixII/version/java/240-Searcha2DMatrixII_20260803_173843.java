// Last updated: 03/08/2026, 17:38:43
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int n=matrix[0].length;
4        int m=matrix.length;
5        for(int i=0;i<m;i++)
6        {
7            for(int j=0;j<n;j++)
8            {
9                if(matrix[i][j]==target)
10                {
11                    return true;
12                }
13            }
14        }
15        return false;
16    }
17}