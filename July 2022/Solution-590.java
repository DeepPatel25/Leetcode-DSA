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

class Solution-590 {
    List<Integer> li = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        post(root);
        return li;
    }
    
    public void post(Node root){
        if(root==null) return;
        
        for(int i=0; i<root.children.size(); i++){
            post(root.children.get(i));
        }
        li.add(root.val);
    }
}