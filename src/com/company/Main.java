package com.company;

public class Main {

    public static void main(String[] args) {
        getBinaryNumber(125);

    }

    public static void getBinaryNumber(Integer number) {
        Integer b;
        String result = "";
        while (number != 0) {
            b = number % 2;
            result = b + result;
            number = number / 2;
        }
        System.out.println("Результат = " + result);
        Integer[] arr = new Integer[result.length()];
        for (int i = 0; i < result.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        Integer maxLength = 0;

        for (int i = 0, length = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                length++;
            }
            if (i == arr.length - 1 || arr[i] != 0) {
                if (length >=
                        maxLength) {
                    maxLength = length;
                    length = 0;
                }
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print("0");
        }
        System.out.println(", наибольшее количество нулей = " + maxLength);
    }
}










