package web.models;

public class Car {
    private String model;
    private String mark;
    private int id;

    public Car(String model, String mark, int id) {
        this.model = model;
        this.mark = mark;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
