package classe;

public class AreCirc {

    double raio;
    double pi;

    AreaCirc(double raioInicial){
        pi = 3.14;
        raio = raioInicial;
    }
   double area(){
        return pi * Math.pow(raio, 2);
   }

}
