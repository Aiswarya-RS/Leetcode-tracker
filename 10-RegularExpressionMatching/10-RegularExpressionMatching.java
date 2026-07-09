// Last updated: 09/07/2026, 09:21:36
class Solution {
    int n, m;
    int[][] dp;
    String s1, s2;

    private boolean match(int i, int j) {
        // If string finished, pattern must be all valid * pairs
        if (i == n) {
            int countStars = 0;
            int ind = j;
            while (ind < m) {
                if (s2.charAt(ind) == '*') countStars++;
                ind++;
            }
            return 2 * countStars == (m - j); // pattern like a*b*c*
        }

        // If pattern finished but string not → false
        if (j == m) return false;

        // Already computed
        if (dp[i][j] != -1) return dp[i][j] == 1;

        // Case 1: Next char is '*'
        if (j + 1 < m && s2.charAt(j + 1) == '*') {
            // Skip this pair
            boolean noPick = match(i, j + 2);
            if (noPick) {
                dp[i][j] = 1;
                return true;
            }
            // Consume characters while they match
            for (int k = i; k < n && (s1.charAt(k) == s2.charAt(j) || s2.charAt(j) == '.'); k++) {
                if (match(k + 1, j + 2)) {
                    dp[i][j] = 1;
                    return true;
                }
            }
        }
        // Case 2: No '*', must match single char
        else {
            if (s2.charAt(j) == '.' || s1.charAt(i) == s2.charAt(j)) {
                if (match(i + 1, j + 1)) {
                    dp[i][j] = 1;
                    return true;
                }
            }
        }

        dp[i][j] = 0;
        return false;
    }

    public boolean isMatch(String s, String p) {
        s1 = s;
        s2 = p;
        n = s.length();
        m = p.length();
        dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, -1);
        return match(0, 0);
    }
}