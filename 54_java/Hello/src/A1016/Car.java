package A1016;

public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car() {}

    Car(String modelName, int modelYear, String color) {
        this("model",2024,"color",50);
    }

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        // this("아반떼", 2016, "흰색", 200);
    }

    public String getModel() {
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }

    @Override
    public String toString() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color + " " + this.maxSpeed + "km";
    }
}
