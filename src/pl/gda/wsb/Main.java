package pl.gda.wsb;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("Hello World!");

	    Animal animal1 = new Animal("dog","Sara",5, 12);
	    Animal animal2 = new Animal("mouse", "Jerry", 10, 4);

	    Human human1 = new Human("Rick", 37, 1.85f);
	    Human human2 = new Human("Jessica", 21, 1.45f);
	    Human human3 = new Human("Roman", 66, 1.68f);

	    Phone phone1 = new Phone("Xiaomi", "Mi 10 Pro plus X", 16);
	    Phone phone2 = new Phone("Motorola", "11 Plus", 8);

		System.out.print("--------------\n");

//		if (animal1.weight == animal2.weight) {
//			System.out.println(animal1.name + " and " + animal2.name + " have the same weight.");
//		}
//		else {
//			System.out.println(animal1.name + " and " + animal2.name + " have NOT the same weight.");
//		}

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

		System.out.println("\n-------------------\n");

		human1.pet = animal1;
		human2.pet = animal2;

		animal2.feed();
		animal2.takeForAWalk();
		animal2.takeForAWalk();
		animal2.takeForAWalk();
		animal2.feed();
		animal2.feed();


		animal1.feed();
		animal1.feed();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.takeForAWalk();
		animal1.feed();

		System.out.println("\n-------------------\n");

		Car car1 = new Car("blue", 3.0f, "Polonez", "FSO");
		Car car2 = new Car("green", 1.0f, "Matiz", "Daewoo");
		human1.car = car1;

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(human1);
		System.out.println(human2);
		System.out.println(phone1);
		System.out.println(phone2);

	}
}
