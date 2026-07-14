// Last updated: 14/07/2026, 18:17:25
1class Solution {
2    public int reverse(int x) {
3         int result = 0;
4    while (x != 0)
5    {
6        int tail = x % 10;
7        int newResult = result * 10 + tail;
8        if ((newResult - tail) / 10 != result)
9        { return 0; }
10        result = newResult;
11        x = x / 10;
12    }
13
14    return result;
15    }
16}
17   