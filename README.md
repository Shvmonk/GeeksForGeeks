# **💡  GeeksForGeeks**
**POTD Solution**

**`BUS CONDUCTOR - MAY 21`**

```java
//BUS CONDUCTOR - MAY 21
class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(chairs[i]-passengers[i]);
        }
        return ans;
    }
}
```
