package fundamentals;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog("Write the first number, please: ");
        String value2 = JOptionPane.showInputDialog("Write the second number, please: ");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        System.out.println("Sum: " + sum);
    }
}
