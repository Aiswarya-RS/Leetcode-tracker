// Last updated: 09/07/2026, 09:18:06
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int sum=0,max=0,len=0;
        int si=0;
        for(int li=1;li<nums.length;li++)
            {
                if(nums[li]-nums[si]==1)
                {
                    len=(li-si+1);
                    if(len>max)
                    {
                        max=len;
                    }
                }
                while((nums[li]-nums[si])>1)
                {
                    si++;
                }
        }
        
        return max;

    }
}