package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int notesAmount = 0;
        double note = 0;
        double total = 0;

        while(note != -1){
            System.out.print("Write the note (or -1 for to exit): ");
            note = entry.nextDouble();

            if(note <= 10 && note >=0){
                total = note;
                notesAmount++;
            } else if(note != -1) {
                System.out.println("Invalid note");
            }
        }

        //Calc the average
        double average = total/notesAmount;
        System.out.println("Total average: " + average);

        entry.close();

    }
}
