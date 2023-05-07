# **💡  GeeksForGeeks**
**POTD Solution**

**`BINARY MODULO - MAY 08`**

```java
//BINARY MODULO - MAY 08
class Solution{
	String reverse(String s) {
		char[] temparray = s.toCharArray();
		int left, right = 0;
        right = temparray.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
        String str = new String(temparray);
        return str;
	}
	int modulo(String s, int m) {
		int n=s.length();
        int [] p = new int[n];
        p[0] = 1;
        for(int i=1;i<n;i++)
            p[i] = (p[i-1] % m * 2 % m) % m;
        int ans=0;
        s = reverse(s);
        for(int i=0;i<n;i++)
        {
            int c= s.charAt(i)-'0';
            c=(c % m * p[i] % m) % m;
            ans = (ans % m + c % m) % m;
        }
        return ans;
	}
}
```
