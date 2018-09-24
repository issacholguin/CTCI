/**
 * Created by issacholguin1 on 7/2/18.
 */
import java.util.*;

public class CH1Q4 {

    public static void main(String[] args) {

        String str = "atco Cat";
        if(isPalindromePermutationByHash(str) == true) System.out.println("yes");
        else System.out.println("no");
        if(isPalindromePermutationByBits(str) == true) System.out.println("yes");
        else System.out.println("no");


    }


    // Bitmap Implementation
    private static boolean isPalindromePermutationByBits(String str) {
        // Convert to lowercase chars
        char[] text = str.toCharArray();
        // replace uppercase letters with lowercase letters
        for (int i = 0; i < str.length(); i++) {
            if (text[i] <= 90 && text[i] >= 65) { // If its an upper case letter
                text[i] = Character.toLowerCase(text[i]);
            }
        }

        int vector = 0;

        for (char c : text) {
            if (c < 'a' || 'z' < c ) continue; // ignore not letter chars, these should

            int bit = 1 << (c - 'a'); // shift 1 bit left the ascii value minus the val of char a
            if ((vector & bit) == 0) { // if the count of the character is even so far
                vector |= bit;          // mark the car in the bit vector as 1
            } else {
                vector &= ~bit;
            }
        }

        if (((vector) & (vector-1)) == 0 || vector == 0) { // if vector is zero, we got an even count for all chars and we are good. If we got an odd count, there should be only one bit, so to check, we subtract 1, which shoud yield all the bits to the right as 1's, AND those values, and it should be zero.
            return true;
        } else {
            return false;
        }

    }


    // HashMap Implementation
    private static boolean isPalindromePermutationByHash(String str) {

        // Solution will take both Upper and Low case Characters by transforming the whole string lowercase
        // Upper Case ASCII range: 65 - 90

        char[] text = str.toCharArray();
        // replace uppercase letters with lowercase letters
        for (int i = 0; i < str.length(); i++) {
            if (text[i] <= 90 && text[i] >= 65) { // If its an upper case letter
                text[i] = Character.toLowerCase(text[i]);
            }
        }

        // Declare our hashmap
        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (char c : text) {
            if (c < 'a' || c > 'z') continue; // skips over non letter char's

            if (!hashmap.containsKey(c)) {
                hashmap.put(c, 1);
            } else {
                hashmap.put(c, hashmap.get(c) + 1);
            }
        }

        int oddVal = 0;
        for (char c : hashmap.keySet()) {
            if (hashmap.get(c) % 2 != 0) {
                oddVal++;
            }
            if (oddVal > 1) {
                return false;
            }
        }


        return true;


    }


}

