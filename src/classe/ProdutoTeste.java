package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25);
//        p1.name = "Notebook";
//        p1.price = 4356.89;
//        p1.discount = 0.25;

        var p2 = new Produto("Black Pen", 12.56, 0.29);
//        p2.name = "Black Pen";
//        p2.price = 12.56;
//        p2.discount = 0.29;

        double finalPrice1 = p1.priceWithDiscount();
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double carAverage = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("The car average = R$%.2f.", carAverage);
    }
}
