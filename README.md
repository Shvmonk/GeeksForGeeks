# **💡  GeeksForGeeks**
**POTD Solution**

**`COUNT SPECIAL NUMBERS - APRIL 05`**

```java
//COUNT SPECIAL NUMBERS - APRIL 05
class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        Map<Integer, Integer> frequency = new HashMap<>();
        LinkedHashSet<Integer> distinctElements = new LinkedHashSet<Integer>();
        int maxVal = 0;
        for (int i = 0; i < N; i++) {
            distinctElements.add(arr[i]);
            maxVal = Math.max(arr[i], maxVal);
            if (frequency.containsKey(arr[i])) {
                int value = frequency.get(arr[i]);
                value++;
                frequency.put(arr[i], value);

            } else {
                frequency.put(arr[i], 1);
            }
        }
        LinkedHashSet<Integer> specialNumbers = new LinkedHashSet<Integer>();
        Iterator<Integer> it = distinctElements.iterator();
        while (it.hasNext()) {
            int i = it.next();
            for (int j = 2 * i; j <= maxVal; j += i) {
                if (distinctElements.contains(j)) {
                    specialNumbers.add(j);
                }
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> ele : frequency.entrySet()) {
            if (ele.getValue() > 1) {
                ans += ele.getValue();
            } else if (specialNumbers.contains(ele.getKey())) {
                ans++;
            }
        }
        return ans;
    }
}
```
