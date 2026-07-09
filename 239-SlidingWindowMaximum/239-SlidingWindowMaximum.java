// Last updated: 09/07/2026, 09:19:19
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output=new int[nums.length - k + 1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0,j=0;i<nums.length;i++)
        {
            int num=nums[i];
            while(!dq.isEmpty() && dq.getLast() < num)
                dq.pollLast();
            dq.addLast(num);
            if(i>=k && nums[i-k] == dq.getFirst())
                dq.pollFirst();
            if(i>=k-1) 
                output[j++]=dq.getFirst();
        }
        return output;
    }
}