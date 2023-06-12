//ROD CUTTING - JUNE 12
class Solution {
    public int cutRod(int price[], int n) {
        int val[] = new int[n + 1];
        val[0] = 0;
        for (int i = 1; i <= n; i++) {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val, price[j] + val[i - j - 1]);
            val[i] = max_val;
        }
        return val[n];
    }
}
