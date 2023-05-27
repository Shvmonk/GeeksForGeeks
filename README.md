# **💡  GeeksForGeeks**
**POTD Solution**

**`MODIFY LINKED LIST 1 - MAY 27`**

```java
//MODIFY LINKED LIST 1 - MAY 27
class Solution
{
    public static Node modifyTheList(Node head)
    {
        if(head.next==null)
        return head;
        Node slow=head,fast=head,mid;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        Node reversedList=mid.next;
        mid.next=null;
        reversedList=reverse(reversedList);
        Node temp2=reversedList,temp=head;
        while(temp2!=null)
        {
            int x=temp.data;
            temp.data=temp2.data-x;
            temp2.data=x;
            temp=temp.next;
            temp2=temp2.next;
        }
        mid.next=reverse(reversedList);
        return head;
    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        while(head!=null)
        {
            Node nxt=head.next;
            head.next=prev;
            prev=head;
            head=nxt;
        }
        return prev;
    }
}
```
