package fundamentals.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        a++; // a = a + 1
        a--; // a = a -1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(++a == b--);
        System.out.println(a);
        System.out.println(b);
    }
}
