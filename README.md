# **💡  GeeksForGeeks**
**POTD Solution**

**`REMOVE THE BALLS - APRIL 14`**

```java
//REMOVE THE BALLS
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<pair> st=new Stack<>();
        for(int i=0;i<N;i++){
            if(st.isEmpty()){
                st.push(new pair(color[i],radius[i]));
            }else{
                if(st.peek().a==color[i] && st.peek().b==radius[i]){
                    st.pop();
                }else{
                    st.push(new pair(color[i],radius[i]));
                }
            }
        }
        return st.size();
    }
    static class pair
    {
        int a,b;
        public pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
}
```
