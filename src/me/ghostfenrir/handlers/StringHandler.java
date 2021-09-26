package me.ghostfenrir.handlers;

import java.util.Arrays;

public class StringHandler {
    public static String valueOf(Object object) {
        return String.valueOf(object);
    }

    public static int Int(String string) {
        return Integer.parseInt(string);
    }

    public static double Double(String string) {
        return Double.parseDouble(string);
    }

    public static float Float(String string) {
        return Float.parseFloat(string);
    }

    public static String getIntArray(int[] array) {
        return Arrays.toString(setIntArray(array));
    }

    public static boolean compareString(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static String showResult(boolean bool) {
        return bool ? "They have the same value" : "They dont have the same value";
    }

    public static String operationResult(String operation, int num1, int num2) {
        return operation.equals("Add") ? valueOf(num1 + num2) : operation.equals("Subtract") ? valueOf(num1 - num2) : "No Operation";
    }

    public static void showArrayContent(String[] array) {
        for (String arrayContent : array) {
            System.out.println(arrayContent);
        }
    }

    private static int[] setIntArray(int[] array) {
        for (int value : array) {
            return array;
        } return null;
    }
}
