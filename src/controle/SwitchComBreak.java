package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String concept = "";
        System.out.println("Write the note: ");
        int note = entry.nextInt();

        switch (note){
            case 10: case 9:
                concept = "A";
                System.out.println("Congratulations! You did very well!!");
                break;
            case 8: case 7:
                    concept = "B";
                    System.out.println("Congratulations! You did well!!");
                    break;
            case 6: case 5:
                System.out.println("You didn't do very well, study more!");
                    concept = "C";
                    break;
            case 4: case 3:
                System.out.println("You didn't do very well, study more!");
                    concept = "D";
                    break;
            case 2: case 1:
                System.out.println("You didn't do very well, study more! I'll call your parents...");
                    concept = "E";
                    break;
            default:
                concept = "Not found";

        }
        System.out.println("The concept is " + concept);
    }
}
