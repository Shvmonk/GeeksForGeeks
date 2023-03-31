// DIVIDE IN INCREMENTAL GROUPS - 27 MARCH (JAVA)
class Solution {
    public int calculate(int pos, int prev, int left, int K, int[][][] dp) {
        if (pos == K) {
            if (left == 0)
                return 1;
            else
                return 0;
        }
        if (left == 0) return 0;
        if (dp[pos][prev][left] != -1) return dp[pos][prev][left];

        int answer = 0;
        for (int i = prev; i <= left; i++) {
            answer += calculate(pos + 1, i, left - i, K, dp);
           
        }

        return dp[pos][prev][left] = answer;
    }
    int countWaystoDivide(int N, int K) {
        int dp[][][] = new int[K + 1][N + 1][N + 1];
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= N; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return calculate(0, 1, N, K, dp);
    }
};
