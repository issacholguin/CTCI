/**
 * Created by issacholguin1 on 7/12/18.
 */
import java.util.*;

public class CH2Q4 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(5);
        list.insert(8);
        list.insert(5);
        list.insert(10);
        list.insert(2);
        list.insert(1);

        LinkedList result = partition(list, 5);
        Node p = result.head;

        while(p != null)
        {
            System.out.print(p.getData() + " ");
            p = p.next;
        }

       /* System.out.println();

        result = partition2(list, 5);
        while(result != null)
        {
            System.out.print(result.data + " ");
            result = result.next;
        }*/
    }

    private static LinkedList partition(LinkedList list, int i) {
        LinkedList lessThan = new LinkedList();
        LinkedList greaterThanOrEqual = new LinkedList();

        Node iterator = list.head;



        while (iterator != null) {
            if (iterator.getData() < i) {
                lessThan.insert(iterator.getData());
            } else {
                greaterThanOrEqual.insert(iterator.getData());
            }
            iterator = iterator.next;
        }

        iterator = lessThan.head;

        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = greaterThanOrEqual.head;



        return lessThan;

        /*LinkedList lessThan = new LinkedList();
        LinkedList greaterThanOrEq = new LinkedList();

        Node listPtr = list.head;

        while (listPtr.next != null) {
            if (listPtr.getData() < i) {
                lessThan.insert(listPtr.getData());
            } else {
                greaterThanOrEq.insert(listPtr.getData());
            }
            listPtr = listPtr.next;
        }

        Node lastInLess = lessThan.head;
        while (lastInLess.next != null) {
            lastInLess = lastInLess.next;
        }

        lastInLess.next = greaterThanOrEq.head;



        return lessThan;*/
    }


}
