package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_4 {
    int a = 10; // Instant Variable
    int b = 5; // Instant Variable
    static String name = "Ravina"; // Static Variable
    static String course = "Java"; // Static Variable

    //Static method
    public static void m1() {
        Programme_4 obj = new Programme_4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(name);
        System.out.println(course);
    }
    //Instance method
    public void m2() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Programme_4.name);
        System.out.println(Programme_4.course);
    }
    //Main method
    public static void main(String[] args) {
        m1();
        Programme_4 obj = new Programme_4();
        obj.m2();
    }
}
