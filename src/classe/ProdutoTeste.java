package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto("Black Pen", 12.56);

        Produto.discount = 0.29;

        System.out.println(p1.name + " " + p1.priceWithDiscount());
        System.out.println(p2.name + " " + p2.priceWithDiscount());

        double finalPrice1 = p1.priceWithDiscount();
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double carAverage = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("The car average = R$%.2f.", carAverage);
    }
}