package hello;


public class Apple {
    private String color;
    private int weight;

    public Apple(){

    };

    public Apple(int w, String c){
        this.weight = w;
        this.color = c;
    }

    public String getColor() {
        return color = this.color;
    }

    public int getWeight() {
        return weight = this.weight;
    }

    public String toString(){
        String dd = "Color : " + this.color + " weight : "  + this.getWeight();

        return dd;
    }
}
