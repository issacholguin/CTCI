import java.util.EmptyStackException;

/**
 * Created by issacholguin1 on 7/25/18.
 */
public class Stack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode top;

    public void push(T data) {
        StackNode<T> item = new StackNode<T>(data);
        item.next = top;
        top = item;


    }

    public T pop() {
        if (top == null) throw new EmptyStackException();

        T item = (T) top.data;
        top = top.next;
        return item;

    }

    public T peek() {
        if (top == null) throw new EmptyStackException();

        return (T) top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        StackNode iterator = top;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
        System.out.println("");
    }

}
