package javaprogramme;
import java.util.Scanner;
/**
 * Write a Java program that takes three numbers as input to calculate
 * and print the average of the numbers.
 */
public class Programme_13_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double a = sc.nextDouble();
        System.out.println("Enter second number : ");
        double b = sc.nextDouble();
        System.out.println("Enter third number : ");
        double c = sc.nextDouble();
        double d = (a + b + c) / 2;
        System.out.println("Average of the numbers are : " + d);
        sc.close();

    }
}
