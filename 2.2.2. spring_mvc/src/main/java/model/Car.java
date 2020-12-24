package model;
public class Car {
    private byte id;
    private String model;
    private int series;
    private String condition;

    public Car(byte id, String model, int series, String condition){
        this.id = id;
        this.model = model;
        this.series = series;
        this.condition = condition;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }
}
