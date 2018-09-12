public class NestedConditionals {

	//sometimes we need to check conditions of conditions
	//example - if it is raining,wear a rain coat
	// if not, dont. But which raincoat will i wear if it is raining, the red or the blue


	public static void main(String[] args) {
		
		boolean raining = true;
		boolean tShirt = false;
		String day = "Tuesday";
		String rainCoat;

	

		if (raining==true) {
			if (day.equalsIgnoreCase("Monday")) {
				rainCoat = "Blue";
				System.out.println(rainCoat);

						} else {
							rainCoat = "Red";
							System.out.println(rainCoat);
						}			
		} else {
			tShirt = true;
			System.out.println(tShirt);

		}

	}
	

}