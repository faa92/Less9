package by.teachmeskills.antonfedoseev.homework9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtils {

    public static void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }

    public static boolean isBlank(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 0 || arr[i] == ' ') {
                return true;
            }
        }
        return false;
    }

    public static boolean isRussia(char... arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 'А' || arr[i] > 'я') && (arr[i] != 'Ё' && arr[i] != 'ё')) {
                return false;
            }
        }
        return true;
    }

    //Задание 4. Списано
    public static boolean contains(char[] arr, char[] subArr) {
        if (subArr.length == 0) {
            return true;
        }
        if (subArr.length > arr.length) {
            return false;
        }
        if (arr.length == 0) {
            return subArr.length == 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int match = 0;
            for (int j = 0; j < subArr.length; j++) {
                if (arr[i + j] != subArr[j]) {
                    break;
                } else {
                    match++;
                }
            }
            if (match == subArr.length) {
                return true;
            }
        }
        return false;
    }

    // Задание 5. Списано
    public static int parseInt(char[] arr) {
        int result = 0;
        int degree = arr.length - 1;

        for (char ch : arr) {
            int tmp = ch - '0';
            if (tmp < 0 || tmp > 9) {
                throw new IllegalArgumentException("Входная строка не является числом!");
            }
            result += tmp * Math.pow(10, degree);
            degree--;
        }
        return result;
    }
}
