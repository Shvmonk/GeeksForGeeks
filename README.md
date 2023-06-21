# **💡  GeeksForGeeks**
**POTD Solution**

**REVERSE CODING - JUNE 21**

```java
//REVERSE CODING - JUNE 21
class Solution {
    static int sumOfNaturals(int n) {
        int mod = 1000000007;
        long ans= ((long)n*(n+1))/2;
        return (int)(ans%mod);
    }
};
```
