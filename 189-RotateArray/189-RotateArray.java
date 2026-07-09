// Last updated: 09/07/2026, 09:19:47
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int temp[]=new int[n];
        int rotation=k%n;
        int ind=0;
        for(int i=n-rotation;i<n;i++)
        {
            temp[ind++]=nums[i];
        }
        for(int i=0;i<n-rotation;i++)
        {
            temp[ind++]=nums[i];
        }
         for(int i=0;i<temp.length;i++)
        {
           nums[i]=temp[i];
        }
    }
}