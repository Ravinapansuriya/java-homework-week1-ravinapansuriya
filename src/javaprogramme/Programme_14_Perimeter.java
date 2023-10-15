package javaprogramme;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_Perimeter {
    public static void main(String[] args) {
        double w = 5.5;
        double h = 8.5;
        double a = w * h;
        double b = (w + h) * 2;
        System.out.println("Area of Traingle is " + a + " and Perimeter is: " + b);
    }
}
