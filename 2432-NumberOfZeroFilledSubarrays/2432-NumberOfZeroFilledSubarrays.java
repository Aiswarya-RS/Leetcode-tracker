// Last updated: 09/07/2026, 09:16:57
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            else
            {
                c=0;
            }
            ans+=c;
        }
        return ans;
    }
}