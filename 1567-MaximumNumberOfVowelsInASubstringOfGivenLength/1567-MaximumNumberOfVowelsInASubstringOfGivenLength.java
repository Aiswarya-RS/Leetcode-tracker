// Last updated: 09/07/2026, 09:17:13
class Solution {
    public int maxVowels(String s, int k) {
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        int count=0,max=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(ch[i]))
            {
                count++;
            }
        }
            max=count;
        for(int i=1;i<=ch.length-k;i++)
        {
            if(isVowel(ch[i-1]))
            {
                count--;
            }
            if(isVowel(ch[i+k-1]))
            {
                count++;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }

        public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
}