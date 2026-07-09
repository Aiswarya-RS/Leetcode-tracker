// Last updated: 09/07/2026, 09:17:14
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,max=0;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        max=sum;
        for(int i=0;i<k;i++)
        {
            sum=sum+cardPoints[cardPoints.length-i-1]-cardPoints[k-i-1];
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}