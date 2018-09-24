/**
 * Created by issacholguin1 on 6/21/18.
 */
import java.util.*;

public class CH1Q2 {

    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "papelw";

        if (isPermutationBySorting(str1, str2) == true)
            System.out.println("yes");
        else
            System.out.println("no");

        if (isPermutation(str1, str2) == true)
            System.out.println("yes");
        else
            System.out.println("no");


    }

    private static boolean isPermutationBySorting(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        java.util.Arrays.sort(s1);
        java.util.Arrays.sort(s2);

        if (Arrays.equals(s1, s2)) return true;

        return false;
    }

    private static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] table = new int[128];

        for (int i = 0; i < str1.length(); i++) { // first iteration increments all the characters index location based on their ascii
            table[str1.charAt(i)]++;
        }

        for (int j = 0; j < str2.length(); j++) { // second iteration decrements all the characters' index locations, checking to see if the value at the specified index is ever negative
            table[str2.charAt(j)]--;
            if (table[str2.charAt(j)] < 0) // if the value is negative, then the character was never in the first string, or theres multiple of that character in the second string.
                return false;
        }

        return true;
    }


}