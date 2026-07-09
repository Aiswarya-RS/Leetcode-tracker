// Last updated: 09/07/2026, 09:20:15
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        int count = 1;
        int max = 1;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1] + 1)
            {
                count++;
            }
            else if(nums[i] != nums[i-1])
            {
                count = 1;
            }
            
            max = Math.max(max, count);
        }
        
        return max;
    }
}