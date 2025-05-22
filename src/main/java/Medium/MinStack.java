package Medium;


import java.util.Stack;

public class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        stack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
