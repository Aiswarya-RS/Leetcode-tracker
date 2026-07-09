// Last updated: 09/07/2026, 09:21:08
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
		int smallest=1;
		for(int i=0;i<nums.length;i++)
		{
		    if(nums[i]==smallest)
		    {
		        smallest++;
		    }
		}
		return smallest;
    }
}