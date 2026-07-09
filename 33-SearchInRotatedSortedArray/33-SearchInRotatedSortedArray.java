// Last updated: 09/07/2026, 09:21:13
class Solution {
    public int search(int[] a, int target) {
         int low=0;
        int high=a.length-1,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]>=a[low])
            {
                if(target>=a[low] && target<=a[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(target>=a[mid] && target<=a[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}