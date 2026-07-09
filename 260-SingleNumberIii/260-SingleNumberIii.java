// Last updated: 09/07/2026, 09:19:13
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);

        int[] res = new int[2];
        int idx = 0;

        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                res[idx++] = nums[i];
                i++;   
            } else {
                i += 2; 
            }
        }

        if (idx < 2) {
            res[idx] = nums[nums.length - 1];
        }

        return res;
    }
}
