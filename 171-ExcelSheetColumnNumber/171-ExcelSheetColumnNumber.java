// Last updated: 09/07/2026, 09:19:51
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            
            result = result * 26 + value;
        }
        
        return result;
    }
}
