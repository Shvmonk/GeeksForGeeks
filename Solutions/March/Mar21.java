//TAXI BOOKING - MARCH 21
class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int mn=(int)1e9;
        for(int i=0;i<N;i++){
            int dist=Math.abs(pos[i]-cur);
            mn=Math.min(mn,dist*time[i]);
        }
        return mn;
    }
}