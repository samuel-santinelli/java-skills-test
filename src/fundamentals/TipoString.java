package fundamentals;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Fulano";
        var sobrenome = "De tal";
        var idade = 39;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome:  " + sobrenome + "\nIdade:  " + idade + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
