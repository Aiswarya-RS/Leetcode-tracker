// Last updated: 09/07/2026, 09:20:38
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}