// Last updated: 09/07/2026, 09:20:03
class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            min=Math.min(num,min);
        }
        return min;
    }
}