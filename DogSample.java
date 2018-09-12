/*
Dogs have names, breeds, and ages and the can
bark, and wag their tails. In addition, when they
get adopted they can have their names changed,
their age changes every year and their breed stays
put. Dogs go to training school.
*/



public class DogSample {
	
	public String name;
	public String breed;
	public int age;

	public DogSample(String nm, int ag, String brd){
		name = nm;
		age = ag;
		breed = brd;
	}

	public void printName(){
		System.out.println(name);
	}

	public void bark(){
		System.out.println("Woof");

	}

	public void wagTail(){
		System.out.println("Wag");
	}

	public void changeName(String nm){
		name = nm;
	}

	public void printBreed(){
		System.out.println(breed);
	}

	public void haveABirthday(){
		age = age +1;
	}

	public void printAge(){
		System.out.println(age);
	}

}