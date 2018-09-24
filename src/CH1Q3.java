/**
 * Created by issacholguin1 on 6/21/18.
 */
import java.util.*;

public class CH1Q3 {

    public static void main(String[] args) {
        String str = "Issac James Holguin Yo gotti        ";
        int length = 28;
        str = replaceSpace(str, length);
        System.out.println(str);
    }

    private static String replaceSpace(String str, int trueLength) {
        // count spaces.
        // figure out new length
        // iterate through backwards, pushing the char we are looking at to the back if its not an empty space.

        // Make new Char array
        char[] sentence = str.toCharArray();

        // count white spaces
        int spaces = 0;
        for (int i = 0; i < trueLength; i++)
            if (sentence[i] == ' ') spaces++;

        // length of this array will be the following, but true length is 13
        int bIndex = trueLength + spaces * 2 - 1; // should be 17 actual slots in the example in the main, back index is 16.


        // iterate through array backwards, move last char in the array in the back if its not an empty space, otherwise, proceed with adding %20
        for (int fIndex = trueLength - 1; fIndex >= 0; fIndex--) {
            if (sentence[fIndex] == ' ') {
                sentence[bIndex--] = '0';
                sentence[bIndex--] = '2';
                sentence[bIndex--] = '%';
            } else {
                sentence[bIndex--] = sentence[fIndex];
            }
        }

        return String.valueOf(sentence);



    }


}
