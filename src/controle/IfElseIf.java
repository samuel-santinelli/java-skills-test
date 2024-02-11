package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Enter the note: ");

        double note = entry.nextDouble();

        if(note > 10 || note < 0){
            System.out.println("The note is invalid");
        } else if(note >= 8.1){
            System.out.println("A Concept");
        } else if(note >= 6.1){
            System.out.println("B Concept");
        } else if(note >= 4.1){
            System.out.println("C Concept");
        } else if(note >= 2.1){
            System.out.println("D Concept");
        } else {
            System.out.println("E Concept");
        }

        System.out.print("End!");
        entry.close();
    }
}
