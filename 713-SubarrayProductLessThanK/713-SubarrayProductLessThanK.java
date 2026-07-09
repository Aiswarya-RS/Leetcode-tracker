// Last updated: 09/07/2026, 09:17:58
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            long prod = 1;

            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];

                if (prod < k) {
                    c++;
                } else {
                    break;
                }
            }
        }

        return c;
    }
}