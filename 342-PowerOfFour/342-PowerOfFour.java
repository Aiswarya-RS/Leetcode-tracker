// Last updated: 09/07/2026, 09:18:58
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n%4==0)
        {
            n=n/4;
        }
        return n==1;
    }
}