// Last updated: 09/07/2026, 09:17:20
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int sum=0,avg=0;
         int n=arr.length;
         for(int i=0;i<k;i++)
         {
            sum+=arr[i];
         }
         int count=0;
         avg=sum/k;
         if(avg>=threshold)
         {
            count++;
         }
         for(int i=1;i<=n-k;i++)
         {
            sum=sum-arr[i-1]+arr[i+k-1];
            avg=sum/k;
            if(avg>=threshold)
            {
                count++;
            }

         }
         return count;
    }
}