package org.example;

import java.math.BigDecimal;

public class ContohFloatingPoint {
    public void testFloatingPointRange() {

        System.out.printf( "Float.MAX_VALUE: %,f\n", Float.MAX_VALUE );
        System.out.printf( "Float.MIN_VALUE: %,f\n", Float.MIN_VALUE );

        System.out.printf( "Double.MAX_VALUE: %,f\n", Double.MAX_VALUE );
        System.out.printf( "Double.MIN_VALUE: %,f\n", Double.MIN_VALUE );
        System.out.println();
        System.out.printf( "Float.MAX_VALUE: %.18g\n", Float.MAX_VALUE );
        System.out.printf( "Float.MIN_VALUE: %.18g\n", Float.MIN_VALUE );

        System.out.printf( "Double.MAX_VALUE: %.18g\n", Double.MAX_VALUE );
        System.out.printf( "Double.MIN_VALUE: %.18g\n", Double.MIN_VALUE );
        System.out.println();
        System.out.printf( "Float.MAX_VALUE: %a", Float.MAX_VALUE );
        System.out.println();
        System.out.printf( "Float.MIN_VALUE: %a", Float.MIN_VALUE );
        System.out.println();
        System.out.printf( "Double.MAX_VALUE: %a", Double.MAX_VALUE );
        System.out.println();
        System.out.printf( "Double.MIN_VALUE: %a", Double.MIN_VALUE );
        System.out.println();
    }

    public void GeneratePrime () {
        int n = 100;

        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }
        //int maxi =
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) System.out.println(i);
        }
        System.out.println(n);
    }

    public void BigDecimalAritmatika() {
        BigDecimal bigNum1 = new BigDecimal("12345678901234567890.123456789");
        BigDecimal bigNum2 = new BigDecimal("98765432109876543210.987654321");
        System.out.println();

        // Addition
        BigDecimal sum = bigNum1.add(bigNum2);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigDecimal difference = bigNum1.subtract(bigNum2);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigDecimal product = bigNum1.multiply(bigNum2);
        System.out.println("Product: " + product);

        // Division
        BigDecimal quotient = bigNum1.divide(bigNum2, 20, BigDecimal.ROUND_HALF_UP);
        System.out.println("Quotient: " + quotient);
    }

    public static void main(String[] args) {
        ContohFloatingPoint fl = new ContohFloatingPoint();
        fl.testFloatingPointRange();
        fl.GeneratePrime();
        fl.BigDecimalAritmatika();
    }
}
