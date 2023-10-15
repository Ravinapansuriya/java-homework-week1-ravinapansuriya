package javaprogramme;
import java.util.Scanner;
/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the Traingle: ");
        double w = sc.nextDouble();
        System.out.println("Enter the height of the Traingle: ");
        double h = sc.nextDouble();
        double A = (w * h) / 2;
        System.out.println("Area of the traingle is: " + A);
        sc.close();
    }
}
