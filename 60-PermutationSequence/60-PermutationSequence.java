// Last updated: 09/07/2026, 09:20:53
class Solution {
    public String getPermutation(int n, int k) {
        int[] numbers = new int[n];
        boolean[] used = new boolean[n];
        int fact = 1;

        // Step 1: Fill the numbers array and compute n!
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
            fact *= (i + 1);
        }

        k--; // Convert k to 0-based index
        StringBuilder result = new StringBuilder();

        // Step 2: Generate each digit of the result
        for (int i = 0; i < n; i++) {
            fact = fact / (n - i); // (n - i - 1)!
            int index = k / fact;

            // Find the index-th unused number
            int count = -1;
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    count++;
                    if (count == index) {
                        result.append(numbers[j]);
                        used[j] = true;
                        break;
                    }
                }
            }

            k = k % fact; // Update k for the next position
        }

        return result.toString();
    }
}
