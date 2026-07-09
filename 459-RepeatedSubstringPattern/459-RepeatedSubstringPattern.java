// Last updated: 09/07/2026, 09:18:18
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                String sub=s.substring(0,i);
                String str="";
                for(int j=0;j<n/i;j++)
                {
                    str+=sub;
                }
                if(str.equals(s))
                    return true;
            }
        }
        return false;
    }
}