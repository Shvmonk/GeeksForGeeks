//TOTAL CUTS- MAY 10
class Solution
{
    public static int totalCuts(int N,int K,int A[])
    {
        int small[]=new int[N];
        int large[]=new int[N];
        large[0]=A[0];
        for(int i=1;i<N;i++){
            large[i]=Math.max(large[i-1],A[i]);
        }
        small[N-1]=A[N-1];
        for(int i=N-2;i>=0;i--){
            small[i]=Math.min(small[i+1],A[i]);
        }
        int ans=0;
        for(int i=0;i<N-1;i++){
            if(large[i]+small[i+1]>=K){
                ans++;
            }
        }
        return ans;
    }
}
