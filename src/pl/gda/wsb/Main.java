package pl.gda.wsb;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("Hello World!");

	    Animal animal1 = new Animal("dog","Sara",5, 12.5f);
	    Animal animal2 = new Animal("mouse", "Jerry", 10, 0.5f);

	    Human human1 = new Human("Rick", 37, 1.85f);
	    Human human2 = new Human("Jessica", 21, 1.45f);
	    Human human3 = new Human("Roman", 66, 1.68f);

	    Phone phone1 = new Phone("Xiaomi", "Mi 10 Pro plus X", 16);
	    Phone phone2 = new Phone("Motorola", "11 Plus", 8);

		System.out.print("--------------\n");

		if (animal1.weight == animal2.weight) {
			System.out.println(animal1.name + " and " + animal2.name + " have the same weight.");
		}
		else {
			System.out.println(animal1.name + " and " + animal2.name + " have NOT the same weight.");
		}

		System.out.print("--------------\n");

		ArrayList<Human> humansList = new ArrayList<>();
		humansList.add(human1);
		humansList.add(human2);

		for (Human human : humansList) {
			System.out.println( "Name: " + human.name + ", age: " + human.age + " height: " + human.height);
		}

		System.out.print("--------------\n");
		humansList.add(human3);

		for (Human human : humansList) {
			System.out.println( "Name: " + human.name + ", age: " + human.age + " height: " + human.height);
		}

		ArrayList<Phone> phonesList = new ArrayList<>();
		phonesList.add(phone1);
		phonesList.add(phone2);

		FileWriter fw = new FileWriter("phones.txt", true);
		for (Phone phone : phonesList) {
			fw.write( "Manufacturer: " + phone.manufacturer + "\nModel: " + phone.model + "\nRAM: " + phone.ram + "\n\n");
		}
		fw.close();
	}
}
