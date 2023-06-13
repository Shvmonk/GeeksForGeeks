//K LARGEST ELEMENTS - JUNE 13
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n-k;i++){
            pq.add(arr[i]);
        }
        if(pq.isEmpty()){
            ArrayList<Integer> A=new ArrayList<>();
            int ans[]=new int[k];
            for(int i:arr){
                A.add(i);
            }
            Collections.sort(A,Collections.reverseOrder());
            int in=0;
            for(int i:A){
                ans[in++]=i;
            }
            return ans;
        }
        for(int i=n-k;i<n;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> A=new ArrayList<>();
        int ans[]=new int[k];
        int in=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=pq.peek())
            A.add(arr[i]);
        }
        Collections.sort(A,Collections.reverseOrder());
        for(int i:A){
            if(in<k)
            ans[in++]=i;
            else break;
        }
        return ans;
    }
}
