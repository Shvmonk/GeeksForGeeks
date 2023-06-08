//FIND KTH PERMUTATION - JUNE 08
class Solution {
    public static String solve(int n, int k, int fact[], int nums[])
    {
        if (n == 0)
            return "";
        int c = k / fact[n - 1] + 1;
        String str = "";
        for (int i = 0; i < nums.length; i++)
        {
            c -= (nums[i] == 0?1:0);

            if (c == 0 && nums[i] == 0)
            {
                nums[i] = 1;
                str += String.valueOf(i + 1);
                break;
            }
        }
        return str + solve(n - 1, k % fact[n - 1], fact, nums);
    }
    public static String kthPermutation(int n,int k) {
        int fact[]=new int[n+1];
        Arrays.fill(fact,1);
        for (int i = 1; i <= n; i++)
            fact[i] = i * fact[i - 1];
        int nums[]=new int[n];
        String s = solve(n, k - 1, fact, nums);
        return s;
    }
}  
