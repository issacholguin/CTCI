/**
 * Created by issacholguin1 on 7/17/18.
 */
import java.util.*;

public class CH2Q5 {

    public static void main(String[] args) {
        LinkedList node1 = new LinkedList();
        node1.insert(7);
        node1.insert(1);
        node1.insert(6);

        LinkedList node2 = new LinkedList();
        node2.insert(5);
        node2.insert(9);
        node2.insert(2);

        Node sum = sumLists(node1.head, node2.head, 0);
        Node iterator = sum;
        while(iterator != null)
        {
           System.out.println(iterator.getData() + " ");
           iterator = iterator.next;
        }

        System.out.println();

        /*node1 = new LinkedList();
        node1.insert(1);
        node1.insert(7);

        node2 = new LinkedList();
        node2.insert(2);
        node2.insert(9);
        node2.insert(5);

        sum = sumLists2(node1, node2, 3, 4);
        while(sum != null)
        {
            System.out.print(sum.data + " ");
            sum = sum.next;
        }*/


    }

    private static Node sumLists(Node node1, Node node2, int carry) {
        if (node1 == null && node2 == null & carry == 0) {
            return null;
        }

        Node result = new Node();

        int val = carry;
        if (node1 != null) {
            val += node1.getData();
        }
        if (node2 != null) {
            val += node2.getData();
        }

        result.setData(val%10); // sets the second number of the total value we got

        if (node1 != null || node2 != null) {
            Node another = sumLists(node1 == null ? null : node1.next,
                                    node2 == null ? null : node2.next,
                                    val >= 10 ? 1 : 0);
            result.next = another;

        }
        return result;


    }

    private static LinkedList sumSameL(LinkedList node1, LinkedList node2, LinkedList result, int carry) {
        return node1;

    }


}