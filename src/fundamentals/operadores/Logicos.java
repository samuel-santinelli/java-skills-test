package fundamentals.operadores;

public class Logicos {

    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);

        System.out.println("True table E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("True table OR (OR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("True table exclusive OR (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("True table NOT");
        System.out.println(true);
        System.out.println(false);;

    }
}
