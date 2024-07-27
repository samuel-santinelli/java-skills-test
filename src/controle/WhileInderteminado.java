package controle;

import java.util.Scanner;

public class WhileInderteminado {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String value = "";

        while (!value.equalsIgnoreCase("exit")) {
            System.out.println("You say: ");
            entry.nextLine();
        }

        entry.close();
    }
}
