import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to simple calculator !!!");
        System.out.println("Choose an option to perform operation:  +, -, *, /");
        String operation = sc.next();

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        double result;

        switch (operation){
            case "+":
                result = num1 + num2;
                System.out.println("Addition of these two numbers will be:" + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Subtraction of these two numbers will be:" + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Multiplication of these two numbers will be:" + result);
                break;

            case "/":
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of these two numbers will be:" + result);
                }
                else {
                    System.out.println("Division by ZERO is not allowed");
                }
                break;
            default:
                System.out.println("Error: Invalid operator sign... Please provide valid operator such as +, -, *, /");
        }
        sc.close();
    }
}