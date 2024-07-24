package fundamentals;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Write a number: ");
        double num1 = entry.nextDouble();

        System.out.print("Write a number: ");
        double num2 = entry.nextDouble();

        System.out.print("Write the operation: ");
        String operation = entry.next();

        double result = "+".equals(operation) ? num1 + num2 : 0;
        result = "-".equals(operation) ? num1 - num2 : result;
        result = "*".equals(operation) ? num1 * num2 : result;
        result = "/".equals(operation) ? num1 / num2 : result;
        result = "%".equals(operation) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
        entry.close();
    }
}
