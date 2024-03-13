import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    public MyStack() {
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        int temp = queue.remove();
        queue.add(temp);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
        return temp;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String args[]) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop()); 
        System.out.println(obj.top()); 
        System.out.println(obj.empty()); 
    }
}
