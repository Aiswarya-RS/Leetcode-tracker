// Last updated: 11/08/2026, 14:11:42
1class Solution {
2    public String multiply(String num1, String num2) {
3        int len1 = num1.length();
4        int len2 = num2.length();
5        int arr[] = new int[len1 + len2];
6        for(int i = len1 - 1; i >= 0; i--){
7            for(int j = len2 - 1; j >= 0; j--){
8                int p1 = i + j; // // index where the carry digit would go
9                int p2 = i + j + 1;// // index where the digit after multiplying & addition would go
10                int mult = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
11                int sum = mult + arr[p2]; // number after multiplying and adding
12                arr[p1] += sum / 10; // // carry, placed just to the left and added to its curr number
13                arr[p2] = sum % 10; // // remainder from carry placed at right first
14            }
15        }
16        StringBuilder sb = new StringBuilder();
17        for(int i=0; i<arr.length; i++){
18            if(!(arr[i] == 0 && sb.length() == 0)) sb.append(arr[i]);
19        }
20        if(sb.length() == 0) sb.append(arr[0]); // // every digit in the array is zero, so we need to append it only once
21        return sb.toString();
22    }
23}