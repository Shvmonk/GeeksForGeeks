//PREFIX SUFFIX STRING - APRIL 21
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        trie root=new trie();
        build(s1,root);
        for(int i=0;i<s1.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s1[i].length();j++){
                sb.append(s1[i].charAt(j));
            }
            sb.reverse();
            s1[i]=sb.toString();
        }
        build(s1,root);
        int ans=0;
        for(int i=0;i<s2.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s2[i].length();j++){
                sb.append(s2[i].charAt(j));
            }
            sb.reverse();
            if(find(s2[i],root)==1 || find(sb.toString(),root)==1){
                ans++;
            }
        }
        return ans;
    }
    public void build(String a[], trie root){
        trie temp=null;
        for(int i = 0;i < a.length;i++){
            temp = root;
            for(int j = 0;j < a[i].length();j++){
                if(temp.ch[a[i].charAt(j)-'a'] == null)
                    temp.ch[a[i].charAt(j)-'a'] = new trie();
                temp = temp.ch[a[i].charAt(j)-'a'];
            }
        }
    }
    public int find(String s, trie root){
        for(int i = 0;i < s.length();i++){
            if(root.ch[s.charAt(i)-'a'] == null)
            return 0;
            root = root.ch[s.charAt(i)-'a'];
        }
        return 1;
    }
    public class trie
    {
        trie ch[];
        public trie()
        {
            ch=new trie[26];
            for(int i=0;i<26;i++){
                ch[i]=null;
            }
        }
    }
}
