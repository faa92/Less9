package by.teachmeskills.antonfedoseev.homework9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtils {

    public static void print (char [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void println (char [] arr) {                        //valueOf()  посмотреть!!!!
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }
    // Задание 2
    public static boolean isBlank (char[] arr) {            //isBlank

        for (int i = 0; i < arr.length; i++) {                                  //String isEmpty
            if (arr.length == 0 || arr[i] == ' ') {
                return true;
            }
        }
        return false;
    }
    // Задание 3
    public static boolean isRussia (char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Character.UnicodeBlock.of(arr[i]).equals(Character.UnicodeBlock.CYRILLIC)
            if (i >= 'А' && i <= 'я') {
                return true;
            }
        }
        return false;
    }
    //Задание 4*
    public static boolean contains (char[] arr, char[] arr2) {
        char res;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    return true;
                } else return false;
            }
        }
        return false;
    }

//boolean	contains(CharSequence s)
//Returns true if and only if this string contains the specified sequence of char values.

    //	matches(String regex)
    //Tells whether or not this string matches the given regular expression.

}
