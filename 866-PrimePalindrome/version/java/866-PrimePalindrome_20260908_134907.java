// Last updated: 08/09/2026, 13:49:07
1class Solution {
2    private boolean isPrime(int num) {
3        if (num == 1) return false;
4        for (int i = 2; i * i <= num; i++) {
5            if (num % i == 0) return false;
6        }
7        return true;
8    }
9    
10    private int makePalindrome(int num) {
11        String s = Integer.toString(num);
12        String ans = s + new StringBuilder(s.substring(0, s.length()-1)).reverse().toString();
13        return Integer.parseInt(ans);
14    }
15    
16    public int primePalindrome(int n) {
17        if (n <= 2) return 2;
18        else if (n <= 3) return 3;
19        else if (n <= 5) return 5;
20        else if (n <= 7) return 7;
21        else if (n <= 11) return 11;
22        
23        int i = 1;
24        while (true) {
25            int palin = makePalindrome(i);
26            if (palin >= n && isPrime(palin)) {
27                return palin;
28            }
29            i++;
30        }
31    }
32}