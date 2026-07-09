// Last updated: 09/07/2026, 09:20:40
class Solution {

    public  int removeDuplicates(int[] nums) {
        //test
        int n = nums.length;
        int i = 2; 

        for (int j = 2; j < n; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}