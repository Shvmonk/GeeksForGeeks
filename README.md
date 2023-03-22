# **💡  GeeksForGeeks**
**POTD Solution**

**`TAXI BOOKING - 23 MARCH`**

```java
class Solution
{
    static int ans;
    public static int maxDifferenceBST(Node root,int target)
    {
        int sum=0;
        Node temp=root;
        while(temp!=null)
        {
            if(temp.data==target){
                break;
            }else if(temp.data>target){
                sum+=temp.data;
                temp=temp.left;
            }else{
                sum+=temp.data;
                temp=temp.right;
            }
        }
        if(temp==null){
            return -1;
        }else{
            if(temp.left==null && temp.right==null){
                return sum;
            }
            ans=Integer.MIN_VALUE;
            if(temp.left!=null){
                fun(temp.left,0,sum);
            }
            if(temp.right!=null){
                fun(temp.right,0,sum);
            }
            return ans;
        }
    }
    public static void fun(Node root,int val,int sum)
    {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            ans=Math.max(ans,sum-(val+root.data));
            return;
        }
        fun(root.left,val+root.data,sum);
        fun(root.right,val+root.data,sum);
    }
}
```
