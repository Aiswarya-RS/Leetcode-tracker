// Last updated: 09/07/2026, 09:17:36
class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
	    int temp=0;
        if(n==0)
            return a;
        else if(n==1)
            return b;
	    for(int i=2;i<=n;i++)
	    {
	        c=a+b;
	        temp=a;
	        a=b;
	        b=c;
	    }
	    return c;
    }
}