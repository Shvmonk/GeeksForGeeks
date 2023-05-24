//MAXIMUM IDENTICAL BOWLS - MAY 24
class Solution {
    public static int getMaximum(int N, int[] arr) {
        long total=0;
        for(int i=0;i<N;i++){
            total+=arr[i];
        }
        int p=0;
        for(int i=N;i>=1;i--){
            if(total%i==0){
                p=i;
                break;
            }
        }
        return p;
    }
}
