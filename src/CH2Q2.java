/**
 * Created by issacholguin1 on 7/4/18.
 */


public class CH2Q2 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(3);
        list.insert(6);
        

        //int i = printKthNode(list.head, 1);


        printKthNodeIteratively(list.head, 2);

    }

    private static void printKthNodeIteratively(Node head, int i) {
        // place two pointers i places apart to make sure that when the leading pointer reaches the end, the first pointer
        // will contain the kth to last

        Node p1 = head;
        Node p2 = head;

        for (int j = 0; j < i; j++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        System.out.println(i + "th to the last node is " + p1.getData());



    }

    private static int printKthNode(Node head, int i) {

        if (head == null) {
            return 0;
        }

        int counter = printKthNode(head.next, i) + 1;

        if (counter == i) {
            System.out.println(i + "th to the last node is " + head.data);
        }
        return counter;
    }
/*
    private static void printKthNodeIteratively(Node head, int i) {
        // 8 -> 3 -> 5 -> 6 -> 2 -> 4
        // length: 6 nums
        // i <= 0 , return err
        // 1 should return 4
        // 2 should return 2 ..  etc

        if (i <= 0) {
            System.out.println("Integers 1 or higher!");
            return;
        } else {
            i--;
            // in real words, this makes more sense.
            // If we want the second to last node, we want 2 in the example above.
            // So we decrement the num 2 by 1, and move p2 that many times, then p1 should be the kth to last node.

            Node p1 = head;
            Node p2 = head;

            for (int j = 0; j < i; j++) {
                if (p2.next == null) {
                    System.out.println("Too large for Linked list.");
                    return;
                }
                p2 = p2.next;

            }

            while (p2.next != null) {
                p1 = p1.next;
                p2 = p2.next;
            }

            System.out.println(++i + "th to the last node is " + p1.getData());


        }



    }

    private static int printKthNode(Node head, int k) {
        if (head == null) {
            return 0;
        }

        int index = printKthNode(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to the last node is " + head.data);
        }

        return index;

    }*/




}