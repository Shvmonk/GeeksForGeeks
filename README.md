# **💡  GeeksForGeeks**
**POTD Solution**

**`FROGS AND JUMPS - 26 MARCH`**

```java
//FROGS AND JUMPS -26 MARCH (JAVA)
class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        
        int leaveStatus[] = new int[leaves+1]; 
		for (int i = 0; i < N; i++) {
			if (frogs[i] <= leaves && leaveStatus[frogs[i]] == 0) {
				for (int j = frogs[i]; j <= leaves; j += frogs[i]) {
					leaveStatus[j] = 1;
				}
			}
		}
		int leafCount = leaves;
		for (int i : leaveStatus) {
			if (i==1) {
				leafCount--;
			}
		}
		return leafCount;
    }
};
```
