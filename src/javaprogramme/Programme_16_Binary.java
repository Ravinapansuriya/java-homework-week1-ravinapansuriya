package javaprogramme;
/**
 * Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10 Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */
public class Programme_16_Binary {
    public static void main(String[] args) {
        int a = 10 % 10;
        int b = 11 % 10;
        int c = a + b;

        System.out.println("Addition of two binary number is : " + c);
    }
}
