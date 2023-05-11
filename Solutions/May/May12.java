// ARRAY OPERATIONS - MAY 12
class Solution {
    public static int arrayOperations(int n, int[] arr) {
        int count=0,zero=0;
        boolean isNonZero=false;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                if(isNonZero){
                    count++;
                    isNonZero=false;
                }
            }else{
                isNonZero=true;
            }
        }
        if(isNonZero){
            count++;
        }
        if(zero==n) return 0;
        return count>0?count:-1;
    }
}
