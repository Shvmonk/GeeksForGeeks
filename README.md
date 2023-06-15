# **💡  GeeksForGeeks**
**POTD Solution**

**LONGEST PALINDROME IN A STRING - JUNE 15**

```java
//LONGEST PALINDROME IN A STRING - JUNE 15
class Solution{
    static String longestPalin(String S){
      int fi = 0, fj = 0, j, k, n = S.length ();
        for (int i = 0; i < n; ++i)
        {
            j = i - 1;
            k = i + 1;
            while (j >= 0 && k < n)
            {
                if (S.charAt(j) != S.charAt(k))
                    break;
                j--;
                k++;
            }
            if (k - j - 1 > fj - fi + 1)
            {
                fi = j + 1;
                fj = k - 1;
            }
            if (i < n - 1 && S.charAt(i) == S.charAt(i+1))
            {
                j = i - 1;
                k = i + 2;
                while (j >= 0 && k < n)
                {
                    if (S.charAt(j) != S.charAt(k))
                        break;
                    j--;
                    k++;
                }
                if (k - j - 1 > fj - fi + 1)
                {
                    fi = j + 1;
                    fj = k - 1;
                }
            }
        }
        return S.substring (fi, fj + 1);
    }
}
```
