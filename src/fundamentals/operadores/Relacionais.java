package fundamentals.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';


        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double note = 9.9;
        boolean goodBehavior = false;
        boolean passByAverage = note >= 7;
        boolean hasDiscount = goodBehavior && passByAverage;


        System.out.println("Has discounts?" + hasDiscount);
    }
}
