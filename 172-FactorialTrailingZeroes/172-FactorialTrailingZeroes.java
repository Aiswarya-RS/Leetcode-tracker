// Last updated: 09/07/2026, 09:19:49
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}