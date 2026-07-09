// Last updated: 09/07/2026, 09:17:40
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}