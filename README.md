# **💡  GeeksForGeeks**
**POTD Solution**

**`FIND THE CLOSEST ELEMENT IN BST - JUNE 05**

```java
//PREDECESSOR AND SUCCESSOR - JUNE 06
public static void findPreSuc(Node root, int key)
{
    if (root == null) return ;
    	if (root.data == key)
    	{
    		if (root.left != null)
    		{
    			Node tmp = root.left;
    			while (tmp.right!=null)
    				tmp = tmp.right;
    			pre = tmp ;
    		}
    		if (root.right != null)
    		{
    			Node tmp = root.right ;
    			while (tmp.left!=null)
    				tmp = tmp.left ;
    			suc = tmp ;
    		}
    		return ;
    	}
    	if (root.data > key)
    	{
    		suc = root ;
    		findPreSuc(root.left, key) ;
    	}
    	else
    	{
    		pre = root ;
    		findPreSuc(root.right, key) ;
    	}
}
}
```
