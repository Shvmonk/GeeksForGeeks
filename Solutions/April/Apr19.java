// WIFI RANGE - APRIL 19
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        int A[] = new int[N];
        Arrays.fill(A,(int)-1e9);
        int B[] = new int[N];
        Arrays.fill(B,(int)1e9);
        int cur = (int)-1e9;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == '1'){
                cur = i;
            }
            A[i] = cur;
        }
        cur = (int)1e9;
        for(int i = N - 1; i >= 0; i--){
            if(S.charAt(i) == '1'){
                cur = i;
            }
            B[i] = cur;
        }
        for(int i = 0; i < N; i++){
            if(Math.abs(i - A[i]) > X && Math.abs(i - B[i]) > X){
                return false;
            }
        }
        return true;
    }
}  
