// Last updated: 09/07/2026, 09:19:28
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int half = n / 3;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) count++;
            }

            if (count > half && !res.contains(nums[i])) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}
