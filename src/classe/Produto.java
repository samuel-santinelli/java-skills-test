package classe;

public class Produto {

    String name;
    double price;
    static double discount = 0.25;

    Produto(String InitialName, double InitialPrice){
        name  = InitialName;
        price = InitialPrice;
    }

    double priceWithDiscount(){
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount){
        return price * (1 - discount + managerDiscount);
    }
}