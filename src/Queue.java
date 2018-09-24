import java.util.NoSuchElementException;

/**
 * Created by issacholguin1 on 7/25/18.
 */
public class Queue<T> {
    public static class QueueNode<T> {
        private T data;
        private QueueNode next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data) {
        QueueNode<T> item = new QueueNode<T>(data);
        if (last != null) {
            last.next = item;
        }
        last = item;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();

        T item = first.data;
        first = first.next;
        if (first == null) last = null;
        return item;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void printQueue() {
        QueueNode iter = first;
        System.out.print("{ ");
        while (iter != null) {
            System.out.print(iter.data + " ");
            iter = iter.next;
        }
        System.out.print("}\n");
    }
}
