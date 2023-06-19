# **💡  GeeksForGeeks**
**POTD Solution**

**REARRANGE AN ARRAY WITH O(1) EXTRA SPACE - JUNE 19**

```java
//REARRANGE AN ARRAY WITH O(1) EXTRA SPACE - JUNE 19
class Solution
{
    static void arrange(long arr[], int n)
    {
        int i = 0;
        for(i = 0; i < n; i++)
         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
    }
}
```
