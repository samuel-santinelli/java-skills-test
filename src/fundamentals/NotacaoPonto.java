package fundamentals;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.toUpperCase();
        s = s.replaceAll("X", "Senhora");
        System.out.println(s);
    }
}
