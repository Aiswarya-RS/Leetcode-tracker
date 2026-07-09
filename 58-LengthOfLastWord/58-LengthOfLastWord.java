// Last updated: 09/07/2026, 09:20:54
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isWhitespace(s.charAt(i)))  // for accepting tab spaces
             {
                if (count > 0)
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}