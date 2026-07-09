// Last updated: 09/07/2026, 09:18:56
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

            i++;
            j--;
        }
    }
}