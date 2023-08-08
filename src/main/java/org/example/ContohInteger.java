package org.example;

public class ContohInteger {
    public void testIntegerRange() {

        byte minValueByte = Byte.MIN_VALUE; // Nilai minimum yang dapat disimpan dalam tipe data byte
        byte maxValueByte = Byte.MAX_VALUE; // Nilai maksimum yang dapat disimpan dalam tipe data byte

        System.out.println("Minimum value of byte: " + minValueByte);
        System.out.println("Maximum value of byte: " + maxValueByte);
        System.out.println();

        short minValueShort = Short.MIN_VALUE; // Nilai minimum yang dapat disimpan dalam tipe data short
        short maxValueShort = Short.MAX_VALUE; // Nilai maksimum yang dapat disimpan dalam tipe data short

        System.out.println("Minimum value of short: " + minValueShort);
        System.out.println("Maximum value of short: " + maxValueShort);
        System.out.println();

        int minValueInteger = Integer.MIN_VALUE; // Nilai minimum yang dapat disimpan dalam tipe data int
        int maxValueInteger = Integer.MAX_VALUE; // Nilai maksimum yang dapat disimpan dalam tipe data int

        System.out.println("Minimum value of int: " + minValueInteger);
        System.out.println("Maximum value of int: " + maxValueInteger);
        System.out.println();

        long minValueLong = Long.MIN_VALUE; // Nilai minimum yang dapat disimpan dalam tipe data long
        long maxValueLong = Long.MAX_VALUE; // Nilai maksimum yang dapat disimpan dalam tipe data long

        System.out.println("Minimum value of long: " + minValueLong);
        System.out.println("Maximum value of long: " + maxValueLong);
        System.out.println();
    }

    public void ContohAtitmatika() {
        int a = 50000;
        int b = 40000;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();
    }

    public void ContohAtitmatika2(int a, int b) {
        //int a = 2147483649;
        //int b = 2147483649;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();
    }
    public void ConvertStringtoInt(String numberString) {
        // Konversi string ke integer
        int convertedNumber = Integer.parseInt(numberString);
        System.out.println("Converted Number: " + convertedNumber);
        System.out.println();
        // Konversi integer ke string
        String numberAsString = String.valueOf(convertedNumber);
        System.out.println("Number as String: " + numberAsString);
        System.out.println();
    }

    public static void main(String[] args) {
        ContohInteger intEx = new ContohInteger();
        intEx.testIntegerRange();
        intEx.ContohAtitmatika();
        intEx.ContohAtitmatika2(9223372,50);
        intEx.ConvertStringtoInt("100");
    }
}
