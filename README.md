# **💡  GeeksForGeeks**
**POTD Solution**

**`SHY GEEK - 28 MARCH`**

```//SHY GEEK - 28 MARCH (JAVA)
class Solution{
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        int low = 0, high = n - 1;
        int count = 0;
        Map<Integer, Long> hm = new HashMap<>();
        while(k > 0){
            low = 0;
            while(low <= high){
                int mid = (low+high)/2;
                long temp;
                if(!hm.containsKey(mid))
                    temp = shop.get(mid);
                else
                    temp = hm.get(mid);
                
                hm.put(mid, temp);
                if(temp <= k)
                    low = mid + 1;
                else 
                    high = mid - 1;
            }
            if(high == -1)
                break;
            count += (k/hm.get(high));
            
            k-=(k/hm.get(high))*hm.get(high);
            
        }
        return count;
    }

}
```
