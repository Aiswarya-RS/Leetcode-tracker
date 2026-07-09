// Last updated: 09/07/2026, 09:18:04
class Solution {
    public double findMaxAverage(int[] a, int k) {
        int n=a.length;
        double sum=0,avg=0,max=0;
	    for(int i=0;i<k;i++)
	    {
	        sum+=a[i];
	    }
	    max=sum;
	    for(int i=1;i<=n-k;i++)
	    {
	        sum=sum-a[i-1]+a[i+k-1];
	        if(sum>max)
	        {
	            max=sum;
	        }
	    }
	    return (double)max/k;
    }
}