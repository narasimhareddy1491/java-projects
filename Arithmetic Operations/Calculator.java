import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, output;
        char operator;
        
        System.out.print("Enter the first number: ");
        n1 = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        n2 = sc.nextDouble();
        
        System.out.print("Enter an operator to perform operation(+, -, *, /): ");
        operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+':
                output = n1 + n2;
                System.out.println("Addition of" + n1 + " + " + n2 + " = " + output);
                break;
            case '-':
                output = n1 - n2;
                System.out.println("Subtraction of" + n1 + " - " + n2 + " = " + output);
                break;
            case '*':
                output = n1 * n2;
                System.out.println("Multiplication of" + n1 + " * " + n2 + " = " + output);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Error: Division by zero");
                } 
                else {
                    output = n1 / n2;
                    System.out.println("Division of " + n1 + " / " + n2 + " = " + output);
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
