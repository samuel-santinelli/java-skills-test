package fundamentals;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);
        var b = 4.5;
        System.out.println(b);

        var c = "text";
        System.out.println(c);

        c =  "text";

        c = "Other text";
        System.out.println(c);

        double d;
        d = 123.65;
        System.out.println(d);

        var e = 123.45;
        System.out.println(e);

    }
}
