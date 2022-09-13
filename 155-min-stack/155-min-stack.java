import java.util.*;
class MinStack {
    Stack<Integer> stack = new Stack<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        pq.add(val);
    }
    
    public void pop() {
        pq.remove(stack.pop());
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */