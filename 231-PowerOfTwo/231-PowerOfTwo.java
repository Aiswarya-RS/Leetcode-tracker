// Last updated: 09/07/2026, 09:19:25
class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans=0;
        for(int i=0;i<31;i++)
        {
           ans=(int) Math.pow(2,i);
        if(n==ans)
        {
            return true;
        }
        }
            return false;
    }
}