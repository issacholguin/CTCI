/**
 * Created by issacholguin1 on 7/28/18.
 */
public class CH4Q2 {



    public static void main(String[] args) {

        int[] arr = {1,4,5,6,7,9,10,12,15,17,20,25,27};

        Tree t = null;

        Tree.Node root = minimalNode(arr);



    }

    private static Tree.Node minimalNode(int[] arr) {

        return helper(arr, 0, arr.length-1);

    }

    private static Tree.Node helper(int[] arr, int left, int right) {

    }


}
