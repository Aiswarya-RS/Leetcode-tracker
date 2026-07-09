// Last updated: 09/07/2026, 09:19:53
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--;  
            int remainder = columnNumber % 26;  
            
            char ch = (char) (remainder + 'A');
            result.insert(0, ch); 
            
            columnNumber /= 26;  
        }
        
        return result.toString();  
    }
}
