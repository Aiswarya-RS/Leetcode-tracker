// Last updated: 09/07/2026, 09:17:26
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] a = new int[2001];
        for(int i:arr){
            a[i +1000]++;
        }
        boolean[] freq = new boolean[1001];
        for(int i:a){
            if(i == 0){
                continue;
            }
            if(freq[i]){
                return false;
            }
            else{
                freq[i] = true;
            }
        }
        return true;

    }
}