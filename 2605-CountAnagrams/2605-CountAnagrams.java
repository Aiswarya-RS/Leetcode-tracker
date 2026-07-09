// Last updated: 09/07/2026, 09:16:50
class Solution {
	public int countAnagrams(String s) {
		final int mod = 1_000_000_007; 
		int n = s.length(); 
		long[] fact = new long[n+1], ifact = new long[n+1], inv = new long[n+1]; 
		fact[0] = ifact[0] = inv[0] = inv[1] = 1; 
		for (int x = 1; x <= n; ++x) {
			if (x >= 2) inv[x] = mod - mod/x * inv[mod%x] % mod; 
			fact[x] = fact[x-1] * x % mod; 
			ifact[x] = ifact[x-1] * inv[x] % mod; 
		}
		long ans = 1; 
		for (var buff : s.split(" ")) {
			ans = ans * fact[buff.length()] % mod; 
			int[] freq = new int[26]; 
			for (var ch : buff.toCharArray())  ++freq[ch-'a']; 
			for (var x : freq) ans = ans * ifact[x] % mod; 
		}
		return (int) ans; 
	}
}