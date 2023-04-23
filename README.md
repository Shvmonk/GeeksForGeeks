# **💡  GeeksForGeeks**
**POTD Solution**

**`NEAREST SMALLER TOWER - APRIL 24`**

```java
//NEAREST SMALLER TOWER - APRIL 24
class Solution{
	int [] nearestSmallestTower(int [] arr){
        int n = arr.length;
        Stack<Integer> pre = new Stack<>();
        Stack<Integer> suf = new Stack<>();
        int [] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++)
        {
            while (!pre.empty() && arr[pre.peek()] >= arr[i])
            {
                pre.pop();
            }

            if (!pre.empty())
            {
                res[i] = pre.peek();
            }

            pre.push(i);
        }

        for (int i = n - 1; i >= 0; i--)
        {
            while (!suf.empty() && arr[suf.peek()] >= arr[i])
            {
                suf.pop();
            }

            if (!suf.empty())
            {

                if (res[i] != -1)
                {
                    if (Math.abs(res[i] - i) == Math.abs(suf.peek() - i))
                    {
                        if (arr[res[i]] > arr[suf.peek()])
                            res[i] = suf.peek();
                    }
                    else if (Math.abs(res[i] - i) > Math.abs(suf.peek() - i))
                        res[i] = suf.peek();
                }
                else
                    res[i] = suf.peek();
            }
            suf.push(i);
        }
        return res;
    }
}
```
