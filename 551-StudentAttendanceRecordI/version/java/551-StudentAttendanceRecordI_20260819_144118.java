// Last updated: 19/08/2026, 14:41:18
1class Solution {
2    public boolean checkRecord(String s) {
3        int absentCount = 0;
4        int lateCount = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8
9            if (ch == 'A') {
10                absentCount++;
11                if (absentCount >= 2) {
12                    return false;
13                }
14            }
15
16            if (ch == 'L') {
17                lateCount++;
18                if (lateCount >= 3) {
19                    return false;
20                }
21            } else {
22                lateCount = 0;
23            }
24        }
25
26        return true;
27    }
28}