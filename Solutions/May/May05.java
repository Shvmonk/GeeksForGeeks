//GOOD SUBTREES - MAY 05
class Solution
{
    static int ans;
    public static int goodSubtrees(Node root,int k)
    {
        ans=0;
        fun(root,k);
        return ans;
    }
    public static HashSet<Integer> fun(Node root,int k)
    {
        if(root==null)return new HashSet<>();
        var hs1=fun(root.left,k);
        var hs2=fun(root.right,k);
        HashSet<Integer> hs=new HashSet<>();
        for(int i:hs1){
            hs.add(i);
        }
        for(int i:hs2){
            hs.add(i);
        }
        hs.add(root.data);
        if(hs.size()<=k){
            ans++;
        }
        return hs;
    }
}
