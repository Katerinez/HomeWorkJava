package HomeWork3;

public class Fruit {
    private String fruitName;
    private double weight;

    Fruit(String fruitName, double weight){
        this.fruitName = fruitName;
        this.weight = weight;
    }

    String getName() {
        return this.fruitName;
    }
    Double getWeight(){ return this.weight; }

}
