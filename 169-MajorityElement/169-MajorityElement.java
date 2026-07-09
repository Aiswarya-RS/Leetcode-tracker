// Last updated: 09/07/2026, 09:19:52
class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}