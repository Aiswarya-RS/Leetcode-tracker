// Last updated: 09/07/2026, 09:17:17
import java.util.*;

class Solution {
    public int minSteps(String s, String t) {
        // Convert to lowercase and trim whitespaces
        s = s.toLowerCase().trim().replaceAll("\\s", "");
        t = t.toLowerCase().trim().replaceAll("\\s", "");

        // If lengths are not equal, return -1 (invalid case)
        if (s.length() != t.length()) return -1;

        // Frequency arrays for characters (assuming lowercase a-z)
        int[] countS = new int[26];
        int[] countT = new int[26];

        // Count characters in both strings
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            countT[t.charAt(i) - 'a']++;
        }

        // Calculate extra characters in t
        int steps = 0;
        for (int i = 0; i < 26; i++) {
            // Characters in t that need to be changed
            if (countT[i] > countS[i]) {
                steps += countT[i] - countS[i];
            }
        }

        return steps;
    }
}
