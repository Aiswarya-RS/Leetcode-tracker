// Last updated: 09/07/2026, 09:18:54
class Solution {
    public String reverseVowels(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            boolean isIVowel = false;
            for (char v : vowels) {
                if (chars[i] == v) {
                    isIVowel = true;
                    break;
                }
            }

            boolean isJVowel = false;
            for (char v : vowels) {
                if (chars[j] == v) {
                    isJVowel = true;
                    break;
                }
            }

            if (isIVowel && isJVowel) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else {
                if (!isIVowel)
                    i++;
                if (!isJVowel)
                    j--;
            }
        }

        return new String(chars);
    }

}