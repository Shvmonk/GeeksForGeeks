# **💡  GeeksForGeeks**
**POTD Solution**

**`CONSTRUCT A FULL BINARY TREE - MAY 23`**

```java
//CONSTRUCT A FULL BINARY TREE - MAY 23
class Solution
{
    class gfg
    {
       
            int preIndex = 0;
        
    }
    
    public Node constructBTree(int pre[], int preM[], int size)
    {
        gfg r = new gfg();
        Node root = constructBTreeUtil(pre, preM, r, 0, size-1, size);
        
        return root;
    }
    
    public  Node constructBTreeUtil(int pre[], int preM[], gfg r, int l, int h, int size)
    {
        if (r.preIndex >= size || l > h)
		return null;
    	Node root = new Node(pre[r.preIndex]);
    	++(r.preIndex);
    	if (l == h)	return root;
    	int i;
    	for (i = l; i <= h; ++i)
    	if (pre[r.preIndex] == preM[i])
    	    break;
    	if (i <= h)
    	{
    		root.left = constructBTreeUtil (pre, preM, r, i, h, size);
    		root.right = constructBTreeUtil (pre, preM, r, l+1, i-1, size);
    	}
	    return root; 
    }
}
```
