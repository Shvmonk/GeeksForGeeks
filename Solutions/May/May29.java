//CAMELCASE PATTERN MATCHING  - MAY 29
class Solution{
    ArrayList<String> ans;
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ans=new ArrayList<>();
        trie root=new trie();
        build(Dictionary,root);
        find(Pattern,root);
        Collections.sort(ans);
        if(ans.isEmpty()) ans.add("-1");
        return ans;
    }
    public void build(String a[], trie root){
        trie temp=null;
        for(int i = 0;i < a.length;i++){
            temp = root;
            for(int j = 0;j < a[i].length();j++){
                if(Character.isLowerCase(a[i].charAt(j)))continue;
                if(temp.ch[a[i].charAt(j)-'A'] == null)
                    temp.ch[a[i].charAt(j)-'A'] = new trie();
                temp = temp.ch[a[i].charAt(j)-'A'];
            }
            temp.arr.add(a[i]);
        }
    }
    public int find(String s, trie root){
        for(int i = 0;i < s.length();i++){
            if(root.ch[s.charAt(i)-'A'] == null)
            return 0;
            root = root.ch[s.charAt(i)-'A'];
        }
        printAllWords(root);
        return 1;
    }
    void printAllWords(trie root) {
        for (String str : root.arr) ans.add(str);
        for (int i = 0; i < 26; i++) {
            trie child = root.ch[i];
            if (child!=null) printAllWords(child);
        }
    }
    public class trie
    {
        trie ch[];
        ArrayList<String> arr;
        public trie()
        {
            ch=new trie[26];
            for(int i=0;i<26;i++){
                ch[i]=null;
            }
            arr=new ArrayList<>();
        }
    }
}
