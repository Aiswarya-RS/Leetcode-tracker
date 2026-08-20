// Last updated: 20/08/2026, 13:43:45
1class Solution {
2    // for storing already solved problems
3    Map<String, Boolean> mp = new HashMap<>();
4
5    public boolean isScramble(String s1, String s2) {
6        int n = s1.length();
7
8        // if both strings are not equal in size
9        if (s2.length() != n)
10            return false;
11
12        // if both strings are equal
13        if (s1.equals(s2))
14            return true;
15
16        // if code is reached to this condition then following this are sure:
17        // 1. size of both string is equal
18        // 2. string are not equal
19        // so size is equal (where size==1) and they are not equal then obviously false
20        // example 'a' and 'b' size is equal ,string are not equal
21        if (n == 1)
22            return false;
23
24        String key = s1 + " " + s2;
25
26        // check if this problem has already been solved
27        if (mp.containsKey(key))
28            return mp.get(key);
29
30        // for every iteration it can two condition
31        // 1.we should proceed without swapping
32        // 2.we should swap before looking next
33        for (int i = 1; i < n; i++) {
34            // ex of without swap: gr|eat and rg|eat
35            boolean withoutswap = (
36                    // left part of first and second string
37                    isScramble(s1.substring(0, i), s2.substring(0, i))
38
39                            &&
40
41                            // right part of first and second string;
42                            isScramble(s1.substring(i), s2.substring(i))
43            );
44
45            // if without swap give us right answer then we do not need
46            // to call the recursion withswap
47            if (withoutswap) {
48                mp.put(key, true);
49                return true;
50            }
51
52            // ex of withswap: gr|eat rge|at
53            // here we compare "gr" with "at" and "eat" with "rge"
54            boolean withswap = (
55                    // left part of first and right part of second
56                    isScramble(s1.substring(0, i), s2.substring(n - i))
57
58                            &&
59
60                            // right part of first and left part of second
61                            isScramble(s1.substring(i), s2.substring(0, n - i))
62            );
63
64            // if withswap give us right answer then we return true
65            // otherwise the for loop do it work
66            if (withswap) {
67                mp.put(key, true);
68                return true;
69            }
70            // we are not returning false in else case
71            // because we want to check further cases with the for loop
72        }
73        mp.put(key, false);
74        return false;
75    }
76}