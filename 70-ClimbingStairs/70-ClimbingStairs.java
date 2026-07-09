// Last updated: 09/07/2026, 09:20:47
class Solution {
    public int climbStairs(int n) {
        int a=1,b=2;
        if(n<=2)
        {
            return n;
        }
        else
        {
            for(int i=3;i<=n;i++)
            {
                int c=a+b;
                a=b;
                b=c;
            }
        }
        return b;
    }
}