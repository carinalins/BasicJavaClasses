public class DogList{
	public static void main (String[] args){
	
		int[] years = new int[20];
		
		Dog[] myDogList = new Dog[5];
		
		Dog rex = new Dog("Rex", 2016, "Black");
		myDogList[0] = rex;
		
		myDogList[1] = new Dog("Sammy", 2015, "Yellow");
		myDogList[2] = new Dog("Marley", 2014, "Blue");
		myDogList[3] = new Dog("Rover", 2013, "Brown");
		myDogList[4] = new Dog("Riley", 2012, "Black");
		
		for(int i = 0; i<5; i++){
			
			//myDogList[i].bark();
			
			Dog tempDog = myDogList[i];
			tempDog.bark();
		}
		
		
	
	
	}

}