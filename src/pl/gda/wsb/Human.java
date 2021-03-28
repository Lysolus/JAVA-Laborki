package pl.gda.wsb;

public class Human {
    String name;
    int age;
    float height;
    Animal pet;
    Car car;

    public Human(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
