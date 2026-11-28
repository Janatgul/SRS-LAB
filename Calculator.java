import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println("--------------------");
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);

        input.close();
    }
}