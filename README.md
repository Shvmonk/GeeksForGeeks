# **💡  GeeksForGeeks**
**POTD Solution**

**`MINIMUM INTEGERS - 30 MARCH`**

```java
//MINIMUM INTEGER - 30 MARCH (JAVA)
class Solution {
    public static int minimumInteger(int N, int[] A) {
        int mmin = Integer.MAX_VALUE;
        long sum = 0;
        for(int i : A)
            sum += i;
        for(int X : A)
            if(((long)X*N) >= sum && mmin > X)
                {
                    mmin = X;
                }
        return mmin;
    }
}
```
