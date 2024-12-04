package classe.challenge;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Rice", 0.223);
        Comida c2 = new Comida("Beans", 0.300);

        Pessoa p = new Pessoa("John", 99.8);

        System.out.println(p.present());
        p.eat(c1);
        System.out.println(p.present());
        p.eat(c2);

        System.out.println(p.present());
    }
}
