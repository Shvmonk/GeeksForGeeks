# **💡  GeeksForGeeks**
**POTD Solution**

**`FIND THE CLOSEST ELEMENT IN BST - JUNE 05**

```java
//FIND THE CLOSEST ELEMENT IN BST - JUNE 05
class Solution
{
    static int minDiff(Node  root, int k) 
    { 
        if(root==null)
            return Integer.MAX_VALUE;
        if(root.data==k)
            return 0;
        if(root.data>k)
            return Math.min( Math.abs(root.data-k) , minDiff(root.left,k) );
        return Math.min( Math.abs(root.data-k) , minDiff(root.right,k) );
    }
}
```
