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

class Solution-589 {
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        
        preOrder(root);
        
        return li;
    }
    
    public void preOrder(Node root){
        if(root==null) return;
        
        li.add(root.val);
        for(int i=0; i<root.children.size(); i++){
            preOrder(root.children.get(i));
        }
    }
}