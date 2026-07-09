// Last updated: 09/07/2026, 09:16:39
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0, maxArea = 0;
        for (int[] dim : dimensions) {
            int l = dim[0], w = dim[1];
            int diagonalSq = l * l + w * w;
            int area = l * w;
            if (diagonalSq > maxDiagonal) {
                maxDiagonal = diagonalSq;
                maxArea = area;
            } else if (diagonalSq == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}