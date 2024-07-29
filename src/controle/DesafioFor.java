package controle;

public class DesafioFor {
    public static void main(String[] args) {
        String value = "#";
        for(int i = 1; i <= 10; i++){
            System.out.println(value);
            value += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
