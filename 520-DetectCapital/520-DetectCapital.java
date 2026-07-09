// Last updated: 09/07/2026, 09:18:13
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if(capitalCount == 0 || capitalCount == word.length() || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        } else {
            return false;
        }
    }
}