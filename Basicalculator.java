package calculator;

import java.util.Scanner;

public class Basicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean running = true;

        while (running) {
            System.out.println("\n===== Basic Calculator =====");
            System.out.println("1. + (Addition)");
            System.out.println("2. - (Subtraction)");
            System.out.println("3. * (Multiplication)");
            System.out.println("4. / (Division)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator... Goodbye!");
                running = false; // stop loop
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            

            try {
                switch (choice) {
                    case 1:
                        result = calc.add(num1, num2);
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = calc.subtract(num1, num2);
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = calc.multiply(num1, num2);
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        result = calc.divide(num1, num2);
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
