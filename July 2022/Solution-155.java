class Solution-155 {

    Stack<Integer> a, b;
    public Solution-155() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int val) {
        a.push(val);
        if(b.isEmpty() || val<=b.peek()){
            b.push(val);
        }
    }
    
    public void pop() {
        if(!a.isEmpty()){
            if(a.peek().intValue()==b.peek().intValue()){
                b.pop();
            }
            a.pop();
        }
    }
    
    public int top() {
        return a.peek();
    }
    
    public int getMin() {
        return b.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * Solution-155 obj = new Solution-155();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */