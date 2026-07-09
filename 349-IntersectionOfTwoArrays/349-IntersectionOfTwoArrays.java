// Last updated: 09/07/2026, 09:18:52
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new HashSet<>();
        for(int n : nums1) {
            set.add(n);
        }
        for(int n : nums2){
            if(set.contains(n)){
                list.add(n);
            }
        }
        int ind=0;
        int ans[]=new int[list.size()];
        for(int k:list)
        {
            ans[ind++]=k;
        }
        return ans;
    }
}