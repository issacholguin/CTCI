/**
 * Created by issacholguin1 on 7/25/18.
 */
public class CH3Q1 {

    public static void main(String[] args) {
        Queue<Integer> que = new Queue<>();

        que.add(3);
        que.add(6);
        que.add(5);
        que.add(9);
        que.add(4);
        que.add(8);

        que.printQueue();
        que.remove();
        que.printQueue();

        que.add(42);
        que.printQueue();
        System.out.println(que.peek());

        while (!que.isEmpty()) {
            que.printQueue();
            que.remove();
        }

    }


}
