// Last updated: 09/07/2026, 09:19:16
class Solution {
    public boolean isAnagram(String s1, String s2) {
        s1=s1.toLowerCase();
	    s2=s2.toLowerCase();
	    
	    char c1[]=s1.toCharArray();
	    char c2[]=s2.toCharArray();
	    
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    
	    if(Arrays.equals(c1,c2))
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
    }
}