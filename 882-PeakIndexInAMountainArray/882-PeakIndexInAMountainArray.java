// Last updated: 09/07/2026, 09:17:46
class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int low=1;
        int high=a.length-2,mid=0;
        if(a.length>=3)
        {
        while(low<=high)
        {
            mid=(low+high)/2;
            if((a[mid]>a[mid-1]) && (a[mid]>a[mid+1]))
            {
                return mid;
            }
            else if(a[mid]>a[mid+1])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        }
        return 0;
    }
}