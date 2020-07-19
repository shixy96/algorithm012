/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        List<Node> prevLine = Arrays.asList(root);
        while (!prevLine.isEmpty()) {
            LinkedList<Node> curLine = new LinkedList<>();
            LinkedList<Integer> prevVals = new LinkedList<>();
            for (Node node : prevLine) {
                prevVals.add(node.val);
                if (node.children != null) {
                    curLine.addAll(node.children);
                }
            }
            result.add(prevVals);
            prevLine = curLine;
        }
        return result;
    }
}