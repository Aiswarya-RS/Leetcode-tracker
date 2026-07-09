// Last updated: 09/07/2026, 09:19:46
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for (int i=0;i<nums.length;i++) {
            int pick = prev2 + nums[i];
            int notPick = prev1;

            int current = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}