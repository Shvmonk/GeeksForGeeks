# **💡  GeeksForGeeks**
**POTD Solution**

**`FIND NUMBER - APRIL 29`**

```java
//FIND NUMBER - APRIL 29
class Solution
{
    public long findNumber(long N)
    {
        int a[]={1,3,5,7,9};
		String s="";
		long pre=1;
		long mul=5;
		int times=2;
		while(N>0){
			long temp=(N % mul)-1;
			long ind=(long)((temp+mul)%mul);
			int index=(int)(ind/pre);
			s=a[index]+s;
			N-=mul;
			mul=(long)Math.pow(5,times++);
			pre*=5;
		}
		return Long.parseLong(s);
    }
}
```
