# **💡  GeeksForGeeks**
**POTD Solution**

**ADDING ONES - 11 JUNE**

```java
//ADDING ONES - 11 JUNE 
class Solution {
    public static void update(int a[], int n, int updates[], int k)
    {
        for(int i = 0; i < k; i++)
    			a[updates[i]-1]++;
    	for(int i = 1; i < n; i++)
    		a[i]+=a[i-1];
    }
}
```
