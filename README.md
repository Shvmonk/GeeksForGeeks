# **💡  GeeksForGeeks**
**POTD Solution**

**`COUNT TOTAL SETBITS - MAY 15 `**

```java
//COUNT TOTAL SETBITS - MAY 15 
class Solution {
    public static long countBits(long N) {
        long count = 0;
        for (int i = 0; i < 31; i++) {
            int x = 1 << i;
            long y = (N + 1) / (x * 2) * x;
            long z = (N + 1) % (x * 2) - x;
            count += y + Math.max(z, 0);
        }
        return count;

    }
}
```
