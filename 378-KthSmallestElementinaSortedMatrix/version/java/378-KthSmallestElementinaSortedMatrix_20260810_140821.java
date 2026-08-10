// Last updated: 10/08/2026, 14:08:21
1
2class Solution {
3    public int kthSmallest(int[][] matrix, int k) {
4        int n = matrix.length;
5        int [] arr = new int[n*n];
6        int idx = 0;
7        for(int i = 0;i<n;i++){
8            for(int j = 0;j<n;j++){
9                arr[idx++] = matrix[i][j];
10            }
11        }
12        
13        Arrays.sort(arr);
14        
15        return arr[k - 1];
16    }
17}