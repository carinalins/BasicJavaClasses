public class ShoppingList{
	
	public static void main (String[] args){
		

		
		String[] food = new String [6];
		food[0] = "Chickens";
		food[1] = "Turkey";
		food[2] = "Potatos";
		food[3] = "Carrots";
		food[4] = "Rice";
		food[5] = "Onions";
		
	String[] decoration = {"Christmas Tree","Candles", "Tree Holders", "Door Frame"};
	
	String[] presents = new String[9];
	
		presents[0] = "Bracelets";
		presents[1] = "Earings";
		presents[2] = "Whiskey";
		presents[3] = "Perfumes";
		presents[4] = "Scarf";
		presents[5] = "Bags";
		presents[6] = "Shoes";
		presents[7] = "Shoes";
		presents[8] = "Jumpers";
		
		System.out.println("\t" + "Here is your food list:");
		
		for(int i = 0; i<=5; i++){
			
			System.out.println("\t" + "\t" + food[i]);
			if (food[i].equals("Chicken")){
				System.out.println("I love: " + food[i]);
			} else if (!food[i].equals("Chicken")) {
				System.out.println("No " + food[i] + "in your program");
			} else{
				
			}
		
		}
		
		System.out.println("\n" + "\t" + "Here is your decoration list:");
		for(int i = 0; i<=3; i++){
			System.out.println("\t" + "\t" + decoration[i]);
		}
		System.out.println("\n" + "\t" + "Here is your presents list:");
		for(int i = 0; i<=8; i++){
			System.out.println("\t" + "\t" + presents[i]);
			
		}
	}
}