# **💡  GeeksForGeeks**
**POTD Solution**

**`LEAST PRIME FACTOR- JUNE 07**

```java
//LEAST PRIME FACTOR - 07 JUNE 
class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        int least_prime[]=new int[n+1]; 
        least_prime[1] = 1; 
      
        for (int i = 2; i <= n; i++) 
        {
            if (least_prime[i] == 0) 
            {
                least_prime[i] = i;
                for (int j = 2*i; j <= n; j += i) 
                    if (least_prime[j] == 0) 
                       least_prime[j] = i; 
            } 
        }
        return least_prime;
    }
}
```
