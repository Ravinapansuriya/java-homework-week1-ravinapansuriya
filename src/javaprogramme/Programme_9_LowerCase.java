package javaprogramme;
import java.util.Scanner;
/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words which you wants in lowercase :");
        String str = sc.nextLine();
        String str2 = str.toLowerCase();
        System.out.println("Lowercase:" + str2);
        sc.close();
    }
}
