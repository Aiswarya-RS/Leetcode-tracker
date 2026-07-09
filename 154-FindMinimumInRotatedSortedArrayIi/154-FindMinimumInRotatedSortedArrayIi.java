// Last updated: 09/07/2026, 09:20:02
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}