// Last updated: 09/07/2026, 09:19:24
class Solution {
    public int countDigitOne(int n) {
        int count = 0;

        for (long i = 1; i <= n; i *= 10) {
            int high = (int)(n / (i * 10));
            int cur  = (int)((n / i) % 10);
            int low  = (int)(n % i);

            if (cur == 0)
                count += high * i;
            else if (cur == 1)
                count += high * i + low + 1;
            else
                count += (high + 1) * i;
        }
        return count;
    }
}
