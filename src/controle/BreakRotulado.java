package controle;

public class BreakRotulado {
    public static void main(String[] args) {
        externo:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break externo;
                }
                System.out.print(i + j);
            }
        }
        System.out.print("End!");
    }
}