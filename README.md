# **💡  GeeksForGeeks**
**POTD Solution**

**MAXIMUM DIAMONDS - JUNE 14**

```java
//MAXIMUM DIAMONDS - JUNE 14
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:A){
            pq.add(i);
        }
        long ans=0;
        while(!pq.isEmpty() && K-->0){
            ans+=pq.peek();
            pq.add(pq.poll()/2);
        }       
        return ans;
    }
}
```
