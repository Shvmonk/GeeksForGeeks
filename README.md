# **💡  GeeksForGeeks**
**POTD Solution**

**`EXPRESS AS SUM OF POWER OF NATURAL NUMBER - MAY 26`**

```java
//EXPRESS AS SUM OF POWER OF NATURAL NUMBER - MAY 26
class Solution
{
    static int numOfWays(int n,int x)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        int mod=1000000007;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                int y=(int)Math.pow(i,x);
                if(j>=y){
                    dp[j]=(dp[j]+dp[j-y])%mod;
                }
            }
        }
        return dp[n];
    }
}
```
