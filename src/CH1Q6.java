/**
 * Created by issacholguin1 on 7/3/18.
 */
import java.util.*;

public class CH1Q6 {

    public static void main(String[] args) {

        String str = "aabcccccaaa";
        System.out.println(stringCompression(str));

        str = "aabccaa";
        System.out.println(stringCompression(str));

    }

    private static String stringCompression(String str) {
        int counter = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            counter++;

            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                result.append(str.charAt(i));
                result.append(counter);
                counter = 0;
            }
        }

        return result.length() > str.length() ? str : result.toString();

    }


}