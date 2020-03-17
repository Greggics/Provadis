package aufgabe51;

import java.util.Date;

public class Car {
    private String type;
    private String color;
    private Date registration;

    public Car(String type, String color, Date registration) {
        this.type = type;
        this.color = color;
        this.registration = registration;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Date getRegistration() {
        return registration;
    }
}
