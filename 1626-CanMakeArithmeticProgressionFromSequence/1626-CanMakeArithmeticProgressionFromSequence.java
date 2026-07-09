// Last updated: 09/07/2026, 09:17:12
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int diff=0;
        Arrays.sort(arr);
        diff=arr[1]-arr[0];

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]!=diff)
            {
                return false;
            }
        }
        return true;
    }
}