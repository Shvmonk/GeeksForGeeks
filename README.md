# **💡  GeeksForGeeks**
**POTD Solution**

**`POWERFUL INTEGER - APRIL 30`**

```java
//POWERFUL INTEGER - APRIL 30
class Solution{
    public static int powerfullInteger(int n,int interval[][],int k)
    {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int i=0;i<n;i++){
            tm.put(interval[i][0],tm.getOrDefault(interval[i][0],0)+1);
            tm.put(interval[i][1]+1,tm.getOrDefault(interval[i][1]+1,0)-1);
        }
        int temp=0;
        int ans=0;
        for(Map.Entry<Integer,Integer> e:tm.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value>=0){
                temp+=value;
                if(temp>=k){
                    ans=key;
                }
            }else if(value<0){
                if(temp>=k){
                    ans=key-1;
                }
                temp+=value;
            }
        }
        return (ans==0?-1:ans);
    }
}
```
