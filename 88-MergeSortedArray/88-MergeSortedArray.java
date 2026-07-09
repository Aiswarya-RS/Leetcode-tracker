// Last updated: 09/07/2026, 09:20:34
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mer[]=new int[m+n];
        int ind=0;
        int len=m+n;
        for(int i=0;i<m;i++)
            {
                mer[ind++]=nums1[i];

            }

            for(int i=0;i<n;i++)
            {
                mer[ind++]=nums2[i];
            }
        Arrays.sort(mer);
        for(int i=0;i<len;i++)
        {
            nums1[i]=mer[i];
        }
    }
}