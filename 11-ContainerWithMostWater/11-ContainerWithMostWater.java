// Last updated: 09/07/2026, 09:21:35
class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right)
        {
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            int area=width*h;

            max=Math.max(area,max);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}