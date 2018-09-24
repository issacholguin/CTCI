/**
 * Created by issacholguin1 on 7/24/18.
 */
public class CH2Q6 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);

        list.insert(3);
        list.insert(2);
        list.insert(1);

        if(isPalindromeByReversing(list) == true)
            System.out.println("yes");
        else
            System.out.println("no");


    }

    private static boolean isPalindromeByReversing(LinkedList list) {
        Node headOfNewList = reverseLinkedList(list);
        Node headOfOldList = list.head;
        return isEqual(headOfOldList, headOfNewList);

    }

    private static boolean isEqual(Node headOfOldList, Node headOfNewList) {

        while (headOfOldList != null && headOfNewList != null) {
            if (headOfOldList.getData() != headOfNewList.getData()) {
                return false;
            } else {
                headOfOldList = headOfOldList.next;
                headOfNewList = headOfNewList.next;
            }
        }
        return headOfNewList == null && headOfOldList == null;
    }

    private static Node reverseLinkedList(LinkedList list) {
        Node head = null;
        Node runner = list.head;

        while (runner != null) {
            Node add = new Node();
            add.setData(runner.getData());
            add.next = head;
            head = add;
            runner = runner.next;
        }
        return head;
    }


}
