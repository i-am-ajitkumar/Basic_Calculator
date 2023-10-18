package Calculator;
import java.util.Scanner;
public class BasicCalculatorUsingMethods
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        double result = calculate(num1, num2, operator);

        if (result == Double.MAX_VALUE) 
        {
            System.out.println("Error: Invalid operator or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static double calculate(double num1, double num2, char operator) 
    {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.MAX_VALUE; // Indicate division by zero or invalid operator.
                }
            default:
                return Double.MAX_VALUE; // Indicate invalid operator.
        }
    }}

