// Last updated: 11/09/2026, 13:39:12
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int[] freq = new int[10];
4        for (int d : digits) freq[d]++;
5
6        int count = 0;
7
8        for (int h = 1; h <= 9; h++) {
9            if (freq[h] == 0) continue;
10            freq[h]--;
11
12            for (int t = 0; t <= 9; t++) {
13                if (freq[t] == 0) continue;
14                freq[t]--;
15
16                for (int u = 0; u <= 8; u += 2) {
17                    if (freq[u] > 0) count++;
18                }
19
20                freq[t]++;
21            }
22
23            freq[h]++;
24        }
25
26        return count;
27    }
28}