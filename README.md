# **💡  GeeksForGeeks**
**POTD Solution**

**PERMUTATIONS OF A GIVEN STRING - JUNE 09**

```java
//PERMUTATIONS OF A GIVEN STRING - JUNE 09
class Solution {
    HashSet<String> H;
    public List<String> find_permutation(String S) {
        int n=S.length();
        char c[]=S.toCharArray();
        H=new HashSet<>();
        H.add(S);
        fun(0,c);
        List<String> A=new ArrayList<>();
        for(String i:H){
            A.add(i);
        }
        Collections.sort(A);
        return A;
    }
    public void fun(int i,char c[])
    {
        if(i==c.length)return;
        for(int j=i;j<c.length;j++){
            if(c[i]!=c[j]){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                String st="";
                for(char ch:c){
                    st+=ch;
                }
                H.add(st);
                fun(i+1,c);
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }else{
                fun(i+1,c);
            }
        }
    }
}
```
