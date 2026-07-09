// Last updated: 09/07/2026, 09:20:18
class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
                res+=ch;
        }

        String rev="";
        for(int i=res.length()-1;i>=0;i--)
        {
            rev+=res.charAt(i);
        }

        if(res.equals(rev))
        {
            return true;
        }
        return false;
    }
}