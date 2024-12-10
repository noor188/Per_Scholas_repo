package encapsulation;

public class HumanBeing {

    private float weight;
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    private float bmi;

    public HumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public HumanBeing()
    {}

    public float getWeight(){
        return this.weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }
}
