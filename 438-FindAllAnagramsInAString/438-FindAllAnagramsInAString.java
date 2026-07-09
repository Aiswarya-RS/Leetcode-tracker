// Last updated: 09/07/2026, 09:18:23
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length())
            return res;

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount))
            res.add(0);

        for (int i = p.length(); i < s.length(); i++) {

            sCount[s.charAt(i) - 'a']++;

            sCount[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, sCount))
                res.add(i - p.length() + 1);

        }
        return res;
    }
}