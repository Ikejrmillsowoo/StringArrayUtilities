package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];

        for (int i = 0; i< array.length; i++){
            newArray[i] = array[array.length - 1- i];
        }

        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        ArrayList<String> arrSame = new ArrayList<>();
        ArrayList<String> arrReverse = new ArrayList<>();
        arrSame.addAll(Arrays.asList(array));
        // reverses array and returns void
        arrReverse.addAll(Arrays.asList(array));
        Collections.reverse(arrReverse);

    return arrSame.equals(arrReverse);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        ArrayList<String> contractValue = new ArrayList<>();
        contractValue.addAll(Arrays.asList(alphabet));


        for (int i = 0; i< array.length; i++){
            String [] strToCheck = array[i].split("");
            //boolean count = false;
           for (int c = 0; c < strToCheck.length; c++){
                contractValue.remove(strToCheck[c]);
                contractValue.remove(strToCheck[c].toUpperCase());
           }
       }
//        return count;
        return contractValue.isEmpty();
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(List.of(array));
        arr.remove(valueToRemove);
        Arrays.copyOf(arr.toArray(), arr.size(), String[].class);

        //another option can be
        //String k[] = arr.toArray(new String[arr.size()])

        return Arrays.copyOf(arr.toArray(), arr.size(), String[].class);

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>();
       // arr.addAll(List.of(array));
        int start = 0;
        int compare = 0;

        while (compare <  array.length){
            if (array[start] == array[compare]){
                compare++;
            }else if (array[compare] != array[start] || compare == array.length-1){
                arr.add(array[start]);
                start = compare;
                compare++;
            }
        }
        arr.add(array[compare-1]);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == (array[i+1])){
//                arr.add(array[i]);
//                arr
//                i++;
//            }
//        }
//
//        String [] finalArr = arr.toArray(new String[arr.size()]);
        return arr.toArray(new String[arr.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>();
        // arr.addAll(List.of(array));
        int start = 0;
        int compare = 0;
        String concat = "";

        while (compare <  array.length){
            if (array[start] == array[compare]){
                concat+= array[compare];
                compare++;
            }else if (array[compare] != array[start] || compare == array.length-1){
                arr.add(concat);
                concat = array[compare];
                start = compare;
                compare++;
            }
        }
        arr.add(concat);


//        String [] finalArr = arr.toArray(new String[arr.size()]);
        return arr.toArray(new String[arr.size()]);

    }


}
