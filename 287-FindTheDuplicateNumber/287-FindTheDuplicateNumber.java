// Last updated: 09/07/2026, 09:19:04
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return -1;
    }
}