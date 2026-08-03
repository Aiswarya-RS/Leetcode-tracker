// Last updated: 03/08/2026, 17:57:33
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int n=mat.length,m=mat[0]. length;
4        int sum=0;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<m;j++){
7                if((i==j)||(i+j==n-1)){
8                    sum+=mat[i][j];
9                }
10            }
11        }
12        return sum;
13    }
14}