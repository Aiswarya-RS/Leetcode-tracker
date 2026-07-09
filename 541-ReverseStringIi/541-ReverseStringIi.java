// Last updated: 09/07/2026, 09:18:11
class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
	    int left=0,right=0;
	    for(int i=0;i<ch.length;i+=2*k)
	    {
	        left=i;
	        right=Math.min(i+k-1,ch.length-1);
	        
	        while(left<right)
	        {
	            char temp=ch[left];
	            ch[left]=ch[right];
	            ch[right]=temp;
	            
	            left++;
	            right--;
	        }
	    }
	    return new String(ch);
    }
}