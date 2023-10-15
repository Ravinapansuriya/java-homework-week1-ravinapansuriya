package javaprogramme;
import java.util.Scanner;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhit: ");
        double F = sc.nextDouble();
        double T = (F - 32) * 5 / 9;
        System.out.println("Temperature is in degree : " + T);
        sc.close();
    }
}
