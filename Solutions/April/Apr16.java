//UNEQUAL ARRAYS - APRIL 16
class Solution {
    public static long solve(int N, int[] A, int[] B) {
        long sum = 0;
        ArrayList<Integer> AP[]=new ArrayList[2], BP[]=new ArrayList[2];
        for(int i=0;i<2;i++){
            AP[i]=new ArrayList<>();
            BP[i]=new ArrayList<>();
        }
        for(int i = 0; i < N; i++) {
           sum += A[i] - B[i];
           AP[Math.abs(A[i]) % 2].add(A[i]);
           BP[Math.abs(B[i]) % 2].add(B[i]);
        }
        if(sum != 0 || (int)AP[0].size() != (int)BP[0].size())
        return -1;
        
        long ans = 0;
        for(int i = 0; i < 2; i++) {
           Collections.sort(AP[i]);
           Collections.sort(BP[i]);
        
           for(int j = 0; j < (int)AP[i].size(); j++) {
               ans += Math.abs(AP[i].get(j) - BP[i].get(j)) / 2;
           }
        }
        return ans / 2;
    }
}
