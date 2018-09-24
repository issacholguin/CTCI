/**
 * Created by issacholguin1 on 7/12/18.
 */
import java.util.*;

public class CH2Q3 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        Node p = list.head;

        deleteMiddleNode(p);

        Node node = list.head;

        list.printList();

    }

    private static void deleteMiddleNode(Node p) {
        Node runner = p;
        while (runner.next != null) {
            runner.setData(runner.next.getData());
            if (runner.next.next == null) {
                runner.next = null;
                break;
            }
            runner = runner.next;
        }





    }

   /* private static void deleteMiddleNode(Node n) {
      Node last = n.next;

      while (true) {
          // swap
          // if (last.next == null)
          //    n.next is now null

          n.setData(last.getData());
          if (last.next == null) {
              n.next = null;
              break;
          } else {
              n = n.next;
              last = last.next;
          }


      }


    }*/


}
