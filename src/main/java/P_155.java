import java.util.Deque;
import java.util.LinkedList;

public class P_155 {
    private Deque stack = new LinkedList();
    private Deque minStack = new LinkedList();
    private int min;

    public void push(int val) {
        stack.push(val);
        if (stack.isEmpty()) {
            min = val;
        } else {
            min = Math.min(min, val);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        min = (Integer) minStack.peek();
    }

    public int top() {
        return (Integer) stack.peek();
    }

    public int getMin() {
        return (Integer) minStack.peek();

    }
}
