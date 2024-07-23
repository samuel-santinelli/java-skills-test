package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Write the average");
        double average= entry.nextDouble();

        if(average <= 10 && average >= 7.0) {
            System.out.println("Congratulations! You were...");
            System.out.println("APPROVED!!!");
        }
        if(average < 7 && average >= 4.5) {
            System.out.println("Recovery");
        }
        if(average < 4.5 && average >= 0) {
            System.out.println("Disapprove");
        }

        entry.close();
    }
}
