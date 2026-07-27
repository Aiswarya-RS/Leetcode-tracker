// Last updated: 27/07/2026, 14:54:11
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int count=0;
6        for(int i=0;i<m;i++)
7        {
8            for(int j=0;j<n;j++)
9            {
10                if(grid[i][j]<0)
11                {
12                    count++;
13                }
14            }
15        }
16        return count;
17    }
18}