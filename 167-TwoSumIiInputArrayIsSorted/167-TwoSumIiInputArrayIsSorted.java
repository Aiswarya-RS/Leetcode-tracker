// Last updated: 09/07/2026, 09:19:55
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,h=numbers.length-1;
        int sum=0;
        while(l<h)
        {
            sum=numbers[l]+numbers[h];
            if(sum==target)
            {
                return new int[]{l+1,h+1};
            }
            else if(sum>target)
            {
                h--;
            }
            else
            {
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}