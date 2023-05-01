# **💡  GeeksForGeeks**
**POTD Solution**

**`CAKE DISTRIBUTION PROBLEM - MAY 02`**

```java
//CAKE DISTRIBUTION PROBLEM - MAY 02
class Solution{
	boolean canSplit(int [] sweetness, int mn_value, int k) {
	    int curr = 0;
	    int cnt = 0;
	    
	    for (int i = 0; i < sweetness.length; i++) {
	        curr += sweetness[i];
	        if (curr >= mn_value) {
	            cnt++;
	            curr = 0;
	        }
	    }
	    return cnt >= k + 1;
	}
	int maxSweetness(int [] sweetness, int n, int k) {
	    int sum = 0;
	    int mn_value = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	        sum += sweetness[i];
	        mn_value = Math.min(mn_value, sweetness[i]);
	    }
	    
	    int low = 1;
	    int high = sum;
	    int ans = 0;
	    
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (canSplit(sweetness, mid, k)) {
	            ans = mid;
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    
	    return ans;
	}


}
```
