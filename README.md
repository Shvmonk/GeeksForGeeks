# **💡  GeeksForGeeks**
**POTD Solution**

**`REMAINDER ON DIVIDING BY 11 - APRIL 03`**

```java
//REMAINDER ON DIVIDING BY 11 - APRIL 03
class Solution 
{ 
    static int xmod11(String x)
	{    
	    int len = x.length(); 
  
    int num, rem = 0; 
 
    for (int i = 0; i < len; i++) { 
        num = rem * 10 + (x.charAt(i) - '0'); 
        rem = num % 11; 
    } 
  
    return rem; 
        
	}
} 
```
