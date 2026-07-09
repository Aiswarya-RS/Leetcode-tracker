// Last updated: 09/07/2026, 09:17:21
class Solution {
    public boolean isSolvable(String[] words, String result) {
        boolean[] usedDigits = new boolean[10];
        int[] charToDigit = new int[26];
        boolean[] isLeading = new boolean[26];
        boolean[] charUsed = new boolean[26];
        int charCount = 0;

        // Step 1: Gather all unique characters and mark leading characters
        for (String word : words) {
            if (word.length() > 1) {
                isLeading[word.charAt(0) - 'A'] = true;
            }
            for (char c : word.toCharArray()) {
                if (!charUsed[c - 'A']) {
                    charUsed[c - 'A'] = true;
                    charCount++;
                }
            }
        }

        if (result.length() > 1) {
            isLeading[result.charAt(0) - 'A'] = true;
        }
        for (char c : result.toCharArray()) {
            if (!charUsed[c - 'A']) {
                charUsed[c - 'A'] = true;
                charCount++;
            }
        }

        // Too many characters to map to unique digits
        if (charCount > 10) return false;

        // Step 2: Extract unique characters
        char[] uniqueChars = new char[charCount];
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (charUsed[i]) {
                uniqueChars[idx++] = (char) (i + 'A');
            }
        }

        // Step 3: Start backtracking
        return backtrack(0, uniqueChars, usedDigits, charToDigit, isLeading, words, result);
    }

    private boolean backtrack(int pos, char[] uniqueChars, boolean[] usedDigits, int[] charToDigit,
                              boolean[] isLeading, String[] words, String result) {
        if (pos == uniqueChars.length) {
            // All characters assigned; now evaluate the equation
            long sum = 0;
            for (String word : words) {
                long val = getValue(word, charToDigit);
                if (val == -1) return false;
                sum += val;
            }

            long resultVal = getValue(result, charToDigit);
            return resultVal != -1 && sum == resultVal;
        }

        char curr = uniqueChars[pos];
        int idx = curr - 'A';

        for (int digit = 0; digit <= 9; digit++) {
            if (usedDigits[digit]) continue;
            if (digit == 0 && isLeading[idx]) continue; // Cannot assign 0 to leading character

            usedDigits[digit] = true;
            charToDigit[idx] = digit;

            if (backtrack(pos + 1, uniqueChars, usedDigits, charToDigit, isLeading, words, result)) {
                return true;
            }

            // Backtrack
            usedDigits[digit] = false;
            charToDigit[idx] = -1;
        }

        return false;
    }

    private long getValue(String word, int[] charToDigit) {
        long val = 0;
        for (int i = 0; i < word.length(); i++) {
            int digit = charToDigit[word.charAt(i) - 'A'];
            if (i == 0 && digit == 0 && word.length() > 1) return -1; // Leading zero
            val = val * 10 + digit;
        }
        return val;
    }
}
