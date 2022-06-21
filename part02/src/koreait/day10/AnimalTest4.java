package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	public static void main(String[] args) {
		Animal animal= new Dog();
		Dog puddle =new Dog();
		Crow crow = new Crow();
		Animal animal2 =new Crow();
		
		animal2.print();
		System.out.println(animal.isCrow(puddle));
		System.out.println(animal.isDog(puddle));
		System.out.println(animal.isDog("µ¿¹°"));
		System.out.println(animal.isDog(1));
		System.out.println(animal.isCrow(animal));
		System.out.println(animal.isCrow(crow));
		System.out.println(animal.isCrow(animal2));
		System.out.println(animal.isCrow("±î¸¶±Í"));
	}

}
