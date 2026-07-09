// Last updated: 09/07/2026, 09:20:12
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; ) {
            int count = 1;

            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                count++;
                j++;
            }

            if (count != 3) {
                return nums[i];
            }

            i = j;
        }

        return -1; 
    }
}
