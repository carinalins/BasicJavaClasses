public class TimeTables3{
	public static void main(String [] args){
		int table = 1;
		int count = 1;
		while(table <= 10){
			System.out.println(table + "times tables");
			while(count <= 10){
			int ans = table * count;
		System.out.println(table + " x " + count + " = " + ans);
		count++;
			}
			table++;
			count = 1;
		}
}
}