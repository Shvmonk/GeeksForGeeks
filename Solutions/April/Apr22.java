//SMALLER SUM - APRIL 22
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long ans[]=new long[n];
        long temp[]=new long[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        long pre[]=new long[n];
        pre[0]=temp[0];
        for(int i=1;i<n;i++){
            pre[i]=temp[i]+pre[i-1];
        }
        for(int i=0;i<n;i++){
            if(temp[0]>=arr[i]){
                ans[i]=0;
                continue;
            }
            int l=0,r=n-1;
            while(l<r){
                int mid=(l+r+1)/2;
                if(temp[mid]>=arr[i]){
                    r=mid-1;
                }else{
                    l=mid;
                }
            }
            ans[i]=pre[l];
        }
        return ans;
    }
}
