package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notesStudentA = new double[4];
        System.out.println(Arrays.toString(notesStudentA));

        notesStudentA[0] = 7.9;
        notesStudentA[1] = 8;
        notesStudentA[2] = 6.7;
        notesStudentA[3] = 9.7;

        System.out.println(Arrays.toString(notesStudentA));

        double total = getTotal(notesStudentA);

        Elias nome = new Elias("samuel");
        System.out.println(nome.getNome());
        System.out.println(total / 3);
    }

    private static double getTotal(double[] notesStudentA) {
        double total = 0;
        for (int i = 0; i < notesStudentA.length; i++) {
            total += notesStudentA[i];
        }
        return total;
    }
}
