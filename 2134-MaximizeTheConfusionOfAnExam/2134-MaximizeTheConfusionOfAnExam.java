// Last updated: 09/07/2026, 09:17:00
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int count1=0,count2=0,max=0,len=0;
        int n=answerKey.length();
        int si=0;
        for(int li=0;li<n;li++)
        {
            if(answerKey.charAt(li)=='T')
            {
                count1++;
            }
            else
            {
                count2++;
            }
            while(Math.min(count1,count2)>k)
            {
                if(answerKey.charAt(si)=='T')
                    count1--;
                else
                    count2--;
                si++;
            }
            len=li-si+1;
        if(len>max)
            max=len;
        }
        return max;
    }
}
    