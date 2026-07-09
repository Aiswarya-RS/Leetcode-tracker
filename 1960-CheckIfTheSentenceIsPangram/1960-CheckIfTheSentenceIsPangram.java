// Last updated: 09/07/2026, 09:17:05
class Solution {
    public boolean checkIfPangram(String sentence) {
        String alph="abcdefghijklmnopqrstuvwxyz";
        int count=0;
        sentence.toLowerCase();
        for(char ch='a';ch<='z';ch++)
        {
            boolean found=false;
            for(int i=0;i<sentence.length();i++)
            {
                if(sentence.charAt(i)==ch)
                {
                    count++;
                    found=true;
                    break;
                }
            }
        }

        if(count==26)
            return true;
        return false;
    }
}