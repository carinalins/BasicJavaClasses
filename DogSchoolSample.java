public class DogSchoolSample{

	public static void main(String[] args) {


		DogSample dog1 = new DogSample("Benji", 3, "Cocker Spaniel");
		DogSample dog2 = new DogSample ("Rex", 1, "JRT");

		dog1.bark();
		dog2.wagTail();

		dog1.printAge();
		dog1.haveABirthday();
		dog1.printAge();

		dog2.changeName("Rover");
		dog2.printName();
		dog2.printBreed();
	}
	

}