// Last updated: 09/07/2026, 09:20:21
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0,flag=0;

        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
               return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}