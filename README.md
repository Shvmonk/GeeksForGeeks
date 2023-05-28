# **💡  GeeksForGeeks**
**POTD Solution**

**`NTH NODE FROM END OF LINKED LIST - MAY 28`**

```java
//NTH NODE FROM END OF LINKED LIST - MAY 28
class Solution
{
    int getNthFromLast(Node head, int n)
    {
        Node currNode = head , nthNode = head;
        while(n!=0)
            {
                if(currNode==null)
                    return -1;
                currNode = currNode.next;
                n--;
            }
        while(currNode!=null)   
            {
                nthNode = nthNode.next;
                currNode = currNode.next;
            }
        if(nthNode!=null)
            return nthNode.data;
        else
            return -1;
            
    }
}
```
