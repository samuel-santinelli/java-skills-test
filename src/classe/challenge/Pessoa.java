package classe.challenge;

public class Pessoa {
    String name;
    double weight;

    Pessoa(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    void eat(Comida food){
        if(food != null){
            this.weight += food.weight;
        }
    }

    String present(){
        return "Hi, i'am" + name + " and i have " + weight + " Kgs.";
    }
}
