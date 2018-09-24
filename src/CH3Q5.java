/**
 * Created by issacholguin1 on 7/25/18.
 */
public class CH3Q5 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(23);
        stack.push(1);
        stack.push(4);
        stack.push(17);



        sortStack(stack);



    }

    private static void sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > tmp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }

        tempStack.printStack();



    }


}
