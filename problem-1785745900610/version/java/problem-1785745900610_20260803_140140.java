// Last updated: 03/08/2026, 14:01:40
1class Solution {
2
3    public int[] topKFrequent(int[] nums, int k) {
4
5        int n = nums.length;
6
7        HashMap<Integer, Integer> map = new HashMap<>();
8
9        for (int num : nums) {
10            map.put(num, map.getOrDefault(num, 0) + 1);
11        }
12
13        List<Integer>[] bucket = new ArrayList[n + 1];
14
15        for (int key : map.keySet()) {
16
17            int freq = map.get(key);
18
19            if (bucket[freq] == null) {
20                bucket[freq] = new ArrayList<>();
21            }
22
23            bucket[freq].add(key);
24        }
25
26        int[] ans = new int[k];
27        int index = 0;
28
29        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
30
31            if (bucket[i] != null) {
32
33                for (int num : bucket[i]) {
34
35                    ans[index++] = num;
36
37                    if (index == k)
38                        break;
39                }
40            }
41        }
42
43        return ans;
44    }
45}