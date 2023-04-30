//SUBTREE IN N-ARY TREE - MAY 01
class Solution{
    public int duplicateSubtreeNaryTree(Node root){
        int count = 0;
        hm = new HashMap<>();
        dfs(root);
        for(Map.Entry<String, Integer> e : hm.entrySet()){
            if(e.getValue() > 1)
                count++;
        }
        return count;
    }
    static String dfs(Node node){
        StringBuilder sb = new StringBuilder(node.data + "#");
        for(Node child : node.children){
            sb.append(dfs(child));
        }
        String s = sb.toString();
        hm.put(s, hm.getOrDefault(s, 0) + 1);
        return s;
    }
    static Map<String, Integer> hm;
}
