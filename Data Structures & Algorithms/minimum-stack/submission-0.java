class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);   // 🔴 FIX

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty()) throw new RuntimeException("Stack empty");
        return stack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) throw new RuntimeException("Stack empty");
        return minStack.peek();
    }
}