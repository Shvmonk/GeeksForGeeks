//BHEEM WANTS LADOOS - APRIL 20
class Solution{
    static int sum;
    
    static void add_subtree(Node n, int dist){
        if( (n==null) || (dist<0) ) return;
        sum += n.data;
        add_subtree(n.left, dist-1);
        add_subtree(n.right, dist-1);
    }
    
    static int traverse(Node n, int target, int k){
        if(n==null) return -1;
        if(n.data==target)
        {
            add_subtree(n, k);
            return k-1;
        }
        
        int dist = traverse(n.left, target, k);
        if(dist>-1)
        {
            sum += n.data;
            add_subtree(n.right, dist-1);
            return dist-1;
        }
        
        dist = traverse(n.right, target, k);
        if(dist>-1)
        {
            sum += n.data;
            add_subtree(n.left, dist-1);
            return dist-1;
        }
        
        return -1;
    }
    
    static int ladoos(Node root, int home, int k){
        sum = 0;
        traverse(root, home, k);
        return sum;
    }
}
