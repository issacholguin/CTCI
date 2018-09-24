/**
 * Created by issacholguin1 on 7/4/18.
 */
import java.util.*;


public class LinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node(data);



        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printList() {

        Node n = head;

        while (n.next != null) {
            System.out.println(n.getData());
            n = n.next;
        }

        // Get last node
        System.out.println(n.getData());


    }




}
