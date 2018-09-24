/**
 * Created by issacholguin1 on 7/2/18.
 */
import java.util.*;

public class CH1Q5 {

    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";
        if(isOneWay(str1, str2) == true) System.out.println("yes");
        else System.out.println("no");

        str1 = "pales";
        str2 = "pale";
        if(isOneWay(str1, str2) == true) System.out.println("yes");
        else System.out.println("no");

        str1 = "pale";
        str2 = "bale";
        if(isOneWay(str1, str2) == true) System.out.println("yes");
        else System.out.println("no");

        str1 = "pale";
        str2 = "bae";
        if(isOneWay(str1, str2) == true) System.out.println("yes");
        else System.out.println("no");


    }

    private static boolean isOneWay(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return checkReplacement(str1, str2);
        } else if (Math.abs(str1.length() - str2.length()) == 1) {
            return checkInsertionOrRemoval(str1, str2);
        } else {
            return false;
        }
        
    }

    private static boolean checkInsertionOrRemoval(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // str2 will always be the greater string
        int i = 0, j = 0;

        while(i < str1.length() && j < str2.length())
        {
            if(str1.charAt(i) != str2.charAt(j))
            {
                if(j - i == 1) return false;
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        return true;




    }

    private static boolean checkReplacement(String str1, String str2) {
        int count = 0; // this will check for any replacements in str1 & str2, this shouldn't exceed 1, and actually should be 1

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) count++;
            if (count > 1) return false;
        }


        return true;
    }


}

