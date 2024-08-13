package classe;

public class Produto {

    String name;
    double price;
    double discount;

    Produto(String InitialName, double InitialPrice, double InitialDiscount){
        name  = InitialName;
        price = InitialPrice;
        discount = InitialDiscount;
    }

    double priceWithDiscount(){
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount){
        return price * (1 - discount + managerDiscount);
    }
}
