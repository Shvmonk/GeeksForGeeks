//MINIMUM BST SUM SUBTREE - APRIL 18
class Pair {
    int nodeMin;
    int nodeMax;
    int nodeSum;
    int countNode;
    boolean isBST;
} class Solution {
    static int min;
    public static int minSubtreeSumBST(int target, Node root) {
        // code here
        min = Integer.MAX_VALUE;
        minSubtree(root, target);
        if (min == Integer.MAX_VALUE) min = -1;
        return min;
    }
    public static Pair minSubtree(Node root, int target) {
        if (root == null) {
            Pair p = new Pair();
            p.nodeMin = Integer.MAX_VALUE;
            p.nodeMax = Integer.MIN_VALUE;
            p.nodeSum = 0;
            p.countNode = 0;
            p.isBST = true;
            return p;
        }
        Pair left = minSubtree(root.left, target);
        Pair right = minSubtree(root.right, target);
        int nodeSum = left.nodeSum + right.nodeSum + root.data;
        int countNode = left.countNode + right.countNode + 1;
        int nodeMin =
            Math.min(root.data, Math.min(left.nodeMin, right.nodeMin));
        int nodeMax =
            Math.max(root.data, Math.max(left.nodeMax, right.nodeMax));
        boolean isBST = root.data > left.nodeMax && root.data < right.nodeMin &&
                        left.isBST && right.isBST;
        if (isBST && nodeSum == target) {
            min = Math.min(min, countNode);
        }
        Pair p = new Pair();
        p.nodeMin = nodeMin;
        p.nodeMax = nodeMax;
        p.nodeSum = nodeSum;
        p.countNode = countNode;
        p.isBST = isBST;
        return p;
    }
}
