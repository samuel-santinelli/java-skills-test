package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //if(...) sentence; or {}
        //while(...) sentence; or {}
        //for(...;...;...) sentence; or {}

        //do sentence; or {} while(...);

        Scanner entry = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("You need to talk " + "the magic words...");
            System.out.println("Do you want to back?");
            text = entry.nextLine();
        } while (!text.equalsIgnoreCase("please"));

        System.out.println("Thanks!");
        entry.close();
    }
}
