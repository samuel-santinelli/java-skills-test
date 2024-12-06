package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notesStudentA = new double[3];
        System.out.println(Arrays.toString(notesStudentA));

        notesStudentA[0] = 7.9;
        notesStudentA[1] = 8;
        notesStudentA[2] = 6.7;

        System.out.println(Arrays.toString(notesStudentA));

        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += notesStudentA[i];
        }

        System.out.println(total / 3);
    }
}
