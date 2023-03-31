# **💡  GeeksForGeeks**
**POTD Solution**

**`EVEN SWAP - 31 MARCH`**

```java
//MAKE ARRAY ELEMENTS EQUAL - APRIL 01
class Solution {
    public long minOperations(int N) {
        long ans = N / 2;
        ans *= (N + 1) / 2;
        return ans;
    }
}
```
