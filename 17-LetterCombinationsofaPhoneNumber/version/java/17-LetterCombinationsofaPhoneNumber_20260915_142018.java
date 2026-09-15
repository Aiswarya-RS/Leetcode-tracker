// Last updated: 15/09/2026, 14:20:18
1class Solution {
2   public List<String> letterCombinations(String digits) {
3		LinkedList<String> ans = new LinkedList<String>();
4		if(digits.isEmpty()) return ans;
5		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
6		ans.add("");
7		for(int i =0; i<digits.length();i++){
8			int x = Character.getNumericValue(digits.charAt(i));
9			while(ans.peek().length()==i){
10				String t = ans.remove();
11				for(char s : mapping[x].toCharArray())
12					ans.add(t+s);
13			}
14		}
15		return ans;
16	}
17}