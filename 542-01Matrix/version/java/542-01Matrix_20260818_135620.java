// Last updated: 18/08/2026, 13:56:20
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int rows = mat.length;
4        int cols = mat[0].length;
5        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
6        Queue<int[]> queue = new ArrayDeque<>();
7
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (mat[i][j] == 0) {
11                    queue.add(new int[]{i, j});
12                } else {
13                    mat[i][j] = Integer.MAX_VALUE;
14                }
15            }
16        }
17
18        while (!queue.isEmpty()) {
19            int[] cell = queue.poll();
20            int row = cell[0];
21            int col = cell[1];
22
23            for (int[] direction : directions) {
24                int newRow = row + direction[0];
25                int newCol = col + direction[1];
26
27                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && mat[newRow][newCol] > mat[row][col] + 1) {
28                    mat[newRow][newCol] = mat[row][col] + 1;
29                    queue.add(new int[]{newRow, newCol});
30                }
31            }
32        }
33
34        return mat;        
35    }
36}