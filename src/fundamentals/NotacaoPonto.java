package fundamentals;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replaceAll("X", "Senhora");
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y.length());

        int a = 3;
        System.out.println(a);
    }
}
