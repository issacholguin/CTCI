/**
 * Created by issacholguin1 on 6/4/18.
 */
import java.util.*;
public class CH1Q1 {



    public static void main(String[] args) {
        String str = "abcdefgjions";

        if(isUnique_First(str) == true) System.out.print("yes");
        else System.out.println("no");

        if(isUnique_Second(str) == true) System.out.print("yes");
        else System.out.println("no");

    }

    private static boolean isUnique_Second(String str) {
        if (str.length() > 26)
            return false;

        int hashBit = 0;

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i) - 'a'; // subtract the lowest possible value from the char
            if ((hashBit & (1 << value)) != 0) // compare to our bit level hash table the value at which we shifted the character at
                return false;                // if the value isn't 0, that means there was a bit where both the computed value & hashbit were the same, thus a duplicate.
            hashBit |= (1 << value);         // add this bit to the hash table of bits.

        }


        return true;
    }

    private static boolean isUnique_First(String str) {
        // make int array asciiArr of 128 different slots, all allocated at zero
        // for each letter in the string
        //      if (asciiArr[letter.toChar]) {
        //          increment by 1
        //      else
        //          return false
        // return true
        //
        int asciiArr[] = new int[128];

        for (int i = 0; i < str.length(); i++) {
            if (asciiArr[str.charAt(i)] == 0) {
                asciiArr[str.charAt(i)]++;
            } else {
                return false;
            }
        }

        return true;

    }
}
