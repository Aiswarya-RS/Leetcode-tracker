// Last updated: 09/07/2026, 09:17:03
class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]!=a[i+1] && a[i]!= a[i+2] && a[i+1]!=a[i+2])
            {
                count++;
            }
        }
        return count;
    }
}