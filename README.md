# **💡  GeeksForGeeks**
**POTD Solution**

**`TREE TRANSFORMATION - MAY 22`**

```java
//TREE TRANSFORMATION - MAY 22
class Solution{
    public static int solve(int N, int[] p) {
        int [] g = new int[N + 1];
        for (int i = 1; i < N; i++) {
            g[p[i]]++;
            g[i]++;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (g[i] == 1)
                cnt++;
        }
        return Math.max(N - cnt - 1, 0);
    }
}
```
