// Last updated: 09/07/2026, 09:21:38
class Solution {
    public boolean isPalindrome(int n) {
        int flag=0,ld=0,copy=0,rev=0;
        copy=n;
        while(n>0)
        {
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        if(copy==rev)
        {
            return true;
        }
        return false;
    }
}