// Last updated: 09/07/2026, 09:19:56
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int diff=nums[i+1]-nums[i];
            ans=Math.max(ans,diff);
        }
        return ans;
    }
}