# **💡  GeeksForGeeks**
**POTD Solution**

**`MAX COINS - MAY 04`**

```java
//MAX COINS - MAY 04
class Solution{
    static int dp[][];
    public static int maxCoins(int n,int ranges[][])
    {
        Arrays.sort(ranges,new Comparator<int[]>(){
            public int compare(int first[],int second[]){
                if(first[0]==second[0])
                return first[1]-second[1];
                else
                return first[0]-second[0];
            }
        });
        dp=new int[n+1][3];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(ranges,0,0);
    }
    public static int fun(int ranges[][],int i,int taken)
    {
        
        if(i>=ranges.length || taken>1) return 0;
        if(dp[i][taken]!=-1){
            return dp[i][taken];
        }
        int ans=fun(ranges,i+1,taken);
        int new_idx=(int)(1e9),l=i+1,r=ranges.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ranges[mid][0]>=ranges[i][1]){
                new_idx=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        ans=Math.max(ans,fun(ranges,new_idx,taken+1)+ranges[i][2]);
        return dp[i][taken]=ans;
    }
}
```
