package pl.gda.wsb;

public class Phone {
    String manufacturer;
    String model;
    int ram;

    public Phone(String manufacturer, String model, int ram) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
