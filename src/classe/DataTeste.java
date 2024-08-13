package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.day = 7;
        d1.month = 11;
        d1.year = 2021;


        var d2 = new Data();
        d2.day = 31;
        d2.month = 12;
        d2.year = 2020;

        System.out.printf("%d/%d/%d\n", d1.day, d1.month, d1.year);
        System.out.printf("%d/%d/%d", d2.day, d2.month, d2.year);
    }
}
