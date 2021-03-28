package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    int age;
    private int weight;

    public Animal(String species, String name, int age, int weight) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;

        if (species == "mouse")  this.weight = 2;
        else                     this.weight = 10;
    }

    public void feed() {
        if (this.weight <= 0) System.out.println(this.species + " ---> Sorry, it's too late :(");
        else {
            this.weight += 1;
            System.out.println(this.species + " ---> THX for some food! My weight is now: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight <= 0) System.out.println("Sorry, it's too late :(");
        else if (weight <= 3) {
            this.weight--;
            System.out.println(this.species + " ---> THX but now I'm hungry... my weight is:" + this.weight);
        }
        else {
            this.weight--;
            System.out.println(this.species + " ---> THX for a walk bro... my weight is:" + this.weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
