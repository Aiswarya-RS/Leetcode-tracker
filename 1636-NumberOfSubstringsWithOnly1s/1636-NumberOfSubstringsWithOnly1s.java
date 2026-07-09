// Last updated: 09/07/2026, 09:17:10
class Solution {
    public int numSub(String s) {
        long ans=0,count=0;
        long mod=1000000007;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            else
            {
                count=0;
            }
            ans=(ans+count)%mod;
        }
        return (int)ans;
    }
}