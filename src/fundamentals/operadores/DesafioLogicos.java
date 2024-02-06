package fundamentals.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

    boolean work1 = true;
    boolean work2 = true;

    boolean buyTv50 = work1 && work2;
    boolean buyTv32 = work1 ^ work2;
    boolean buyIceCream = work1 || work2;
    boolean moreHealthy = !buyIceCream;

    System.out.println("Do you buy 50 TV'\" ?" + buyTv50);
    System.out.println("Do you buy 32 TV'\" ?" + buyTv32);
    System.out.println("Do you buy ice cream'\" ?" + buyIceCream);
    System.out.println("Do you buy ice cream'\" ?" + buyIceCream);
    System.out.println("Do you are healthy'\" ?" + moreHealthy);
    }
}
