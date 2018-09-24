import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by issacholguin1 on 7/4/18.
 */

public class CH2Q1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(3);

        System.out.println("Old List:");
        list.printList();

        removeDups(list);
        System.out.println("New List:");

        list.printList();



    }

    private static void removeDups(LinkedList list) {
        // make new hashset
        // 1 -> 3 -> 1 -> 4 -> 3
        // make runner node and point to head of the list.
        // add first node to the list
        //
        // while runner.next isn't null
            // if runner.next node isn't in the hashset,
            //      add runner.next to hashset.
            // else
            //      runner.next = runner.next.next //



        HashSet<Integer> set = new HashSet<>();

        Node runner = list.head;

        set.add(runner.getData());

        while (runner.next != null) {
            if (set.contains(runner.next.getData())) {
                runner.next = runner.next.next;
            } else {
                set.add(runner.next.getData());
                runner = runner.next;
            }
        }





    }


}

    /*HashSet<Integer> set = new HashSet<Integer>();

    Node runner = list.head;

        set.add(runner.getData());


                while (runner.next != null) {
                if (set.contains(runner.next.getData())) {
                runner.next = runner.next.next;
                } else {
                set.add(runner.getData());
                runner = runner.next;

                }
                }*/