/**
 * Created by issacholguin1 on 7/4/18.
 */
public class Node {
    int data;
    Node next = null;

    public Node() {}

    public Node(int i) {
        data = i;
    }

    public int getData() {return data;}

    public void setData(int i) {data = i;}

    public void addToEnd(int i) {
        Node add = new Node(i);

        Node head = this;
        while (head.next != null) head = head.next;

        head.next = add;
    }


}
