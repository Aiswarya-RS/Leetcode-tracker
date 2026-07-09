// Last updated: 09/07/2026, 09:20:05
class Solution {
    public String reverseWords(String s) {
        String words[]=s.trim().split("\\s+");
        String sp="";
        for(int i=words.length-1;i>0;i--)
        {
            sp+=words[i]+ " ";
        }
        return sp+words[0];
    }
}