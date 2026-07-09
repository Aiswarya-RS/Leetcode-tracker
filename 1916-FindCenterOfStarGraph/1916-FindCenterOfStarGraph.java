// Last updated: 09/07/2026, 09:17:06
class Solution {
    public int findCenter(int[][] e) {
        return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
    }
}