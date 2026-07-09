// Last updated: 09/07/2026, 09:16:56
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0,min=k;
        int n=blocks.length();
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
        }
        min=count;
        for(int i=1;i<=n-k;i++)
        {
            if(blocks.charAt(i-1)=='W')
            {
                count--;
            }
            if(blocks.charAt(i+k-1)=='W')
            {
                count++;
            }
            if(count<min)
            {
                min=count;
            }
        }
        return min;
    }
}