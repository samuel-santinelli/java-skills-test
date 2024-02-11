package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter the name of the day: ");

        String day = entry.next();

        if("sunday".equalsIgnoreCase(day)){
            System.out.println(1);
        } else if("monday".equalsIgnoreCase(day)){
            System.out.println(2);
        } else if("tuesday".equalsIgnoreCase(day)){
            System.out.println(3);
        } else if("wednesday".equalsIgnoreCase(day)){
            System.out.println(4);
        } else if("thursday".equalsIgnoreCase(day)){
            System.out.println(5);
        } else if("friday".equalsIgnoreCase(day)){
            System.out.println(6);
        } else if("saturday".equalsIgnoreCase(day)){
            System.out.println(7);
        } else {
            System.out.println("invalid date");
        }

        entry.close();
    }
}
