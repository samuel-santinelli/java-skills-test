package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.name = "Notebook";
        p1.price = 4356.89;
        p1.discount = 0.25;

        var p2 = new Produto();
        p2.name = "Black Pen";
        p2.price = 12.56;
        p2.discount = 0.29;

        double finalPrice1 = p1.price * (1 - p1.discount);
        double finalPrice2 = p2.price * (1 - p1.discount);
        double carAverage = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("The car average = R$%.2f.", carAverage);
    }
}
