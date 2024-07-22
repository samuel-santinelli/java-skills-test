package fundamentals.operadores;

public class Ternario {
    public static void main(String[] args) {
        double average = 8.6;
        String finalResult = average >= 7.0 ? "aprovado." : "em recuperação.";
        System.out.println("O aluno está " + finalResult);

        double note = 9.9;
        boolean goodBehavior = false;
        boolean passByAverage = note >= 7;
        boolean hasDiscount = goodBehavior && passByAverage;
        String result = hasDiscount ? "Sim." : "Não";

        System.out.printf("Has discount %s",result);
    }
}
