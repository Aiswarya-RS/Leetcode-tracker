// Last updated: 09/07/2026, 09:19:01
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;   

        while (n % 3 == 0) {      
            n /= 3;
        }

        return n == 1;             
    }
}