// Last updated: 31/08/2026, 13:51:46
1class Solution {
2    public int nthUglyNumber(int n) {
3        PriorityQueue<Long> pq = new PriorityQueue<>();
4        HashSet<Long> set = new HashSet<>();
5
6        pq.add(1L);
7        set.add(1L);
8
9        long ugly = 1;
10
11        while (n-- > 0) {
12            ugly = pq.poll();
13
14            long a = ugly * 2;
15            long b = ugly * 3;
16            long c = ugly * 5;
17
18            if (a <= Integer.MAX_VALUE && set.add(a)) {
19                pq.add(a);
20            }
21
22            if (b <= Integer.MAX_VALUE && set.add(b)) {
23                pq.add(b);
24            }
25
26            if (c <= Integer.MAX_VALUE && set.add(c)) {
27                pq.add(c);
28            }
29        }
30
31        return (int) ugly;
32    }
33}