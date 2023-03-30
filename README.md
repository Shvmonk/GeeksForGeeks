# **💡  GeeksForGeeks**
**POTD Solution**

**`EVEN SWAP - 31 MARCH`**

```java
//EVEN SWAP - 31 MARCH (JAVA)
class Solution{
    
	void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void sort(int [] arr, int i, int j) {
		Arrays.sort(arr, i, j);
		while(i < j) {
			swap(arr, i++, --j);
		}
	}
	
	int [] lexicographicallyLargest(int [] arr, int n) {
		int i=0;
        while(i<n)
        {
            int j=i+1;
            while(j<n && arr[j]%2 == arr[j-1]%2)
            {
                j++;
            }
            sort(arr, i, j);
            i=j;
        }
        return arr;
	}
}
```
