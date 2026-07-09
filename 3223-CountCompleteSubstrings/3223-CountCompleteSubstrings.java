// Last updated: 09/07/2026, 09:16:47
class Solution {
    public int countCompleteSubstrings(String word, int k) {
        int totalUniqueChars = (int) word.chars().distinct().count();
        int count = 0;

        for (int uniqueChars = 1; uniqueChars <= totalUniqueChars; uniqueChars++) {
            int windowSize = uniqueChars * k;
            if (windowSize > word.length()) {
                break;
            }

            int[] charToCount = new int[26];
            for (int i = 0; i < windowSize; i++) {
                charToCount[word.charAt(i) - 'a']++;
            }

            if (isEqualKTimes(charToCount, k) && areAdjacentCharsValid(word, 0, windowSize - 1)) {
                count++;
            }

            for (int start = 1; start <= word.length() - windowSize; start++) {
                charToCount[word.charAt(start - 1) - 'a']--;
                charToCount[word.charAt(start + windowSize - 1) - 'a']++;

                if (isEqualKTimes(charToCount, k) && areAdjacentCharsValid(word, start, start + windowSize - 1)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isEqualKTimes(int[] charToCount, int k) {
        for (int count : charToCount) {
            if (count != 0 && count != k) {
                return false;
            }
        }
        return true;
    }

    private boolean areAdjacentCharsValid(String word, int start, int end) {
        for (int i = start; i < end; i++) {
            if (Math.abs(word.charAt(i) - word.charAt(i + 1)) > 2) {
                return false;
            }
        }
        return true;
    }
}