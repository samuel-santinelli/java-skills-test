package classe;

public class Produto {

    String name;
    double price;
    double discount;

    double priceWithDiscount(){
        return price * (1 - discount);
    }
}
