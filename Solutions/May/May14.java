//MAXIMUM SUBSET SUM - MAY 14
class Solution {
    public long findMaxSubsetSum(int N, int[] A)
    {
        long[][] dp = new long[N+1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 1; i <= N; i++) 
        {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = Math.max(dp[i-1][0] + A[i-1], dp[i-1][1] + A[i-1]);
        }
        return Math.max(dp[N][0], dp[N][1]);
    }
}
