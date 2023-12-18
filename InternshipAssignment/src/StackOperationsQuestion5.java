import java.util.*;

public class StackOperationsQuestion5 {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(5);
        s.push(2);
        s.push(8);
        s.push(3);
        System.out.println("Top of the Stack: " + s.top());
        System.out.println("Popped Element: " + s.pop());
        System.out.println("Top of the Stack: " + s.top());
    }
}
class stack {
    Queue < Integer > q = new LinkedList < > ();
    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        return q.remove();
    }
    int top() {
        return q.peek();
    }
}