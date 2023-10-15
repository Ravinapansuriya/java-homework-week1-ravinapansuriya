package javaprogramme;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and
 * division methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        subtraction(a,b);
        addition(a,b);
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a,b);
        obj.devision(a,b);

    }
    public static void addition(int a,int b){
        int ans = a+b;
        System.out.println("Addition of two number is : " +ans);

    }
    public static void subtraction(int a,int b){
        int ans = a-b;
        System.out.println("subtraction of two number is : " +ans);
    }
    public void multiplication(int a,int b){
        int ans = a*b;
        System.out.println("multiplication of two number is : " +ans);
    }
    public  void devision(int a,int b){
        int ans = a/b;
        System.out.println("devision of two number is : " +ans);
    }
}
