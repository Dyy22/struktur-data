package org.example;

public class MyClass {
    public void myMethod() {

        // Field
        int myInteger = 10;

        // Konstanta
        final double PI = 3.14159;

        // Variabel
        String myString = "Hello, world!";
        System.out.println(myString);
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.myMethod();
    }
}
