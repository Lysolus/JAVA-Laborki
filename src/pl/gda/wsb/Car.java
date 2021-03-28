package pl.gda.wsb;

import java.util.Objects;

public class Car {
    String color;
    double engine;
    final String model;
    final String producer;

    public enum Producer {
        KIA, Ford, Seat, Audi, BMW;
    }

    public Car(String color, double engine, String model, String producer) {
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engine, engine) == 0 && Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(producer, car.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine, model, producer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
