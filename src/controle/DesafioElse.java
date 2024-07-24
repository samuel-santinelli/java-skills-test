package controle;

import javax.swing.*;

public class DesafioElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Enter the number");
        int number = Integer.parseInt(value);

        if(number % 2 == 0){
            System.out.println("Pair number");
        }else {
            System.out.println("Odd number");
        }
    }
}
