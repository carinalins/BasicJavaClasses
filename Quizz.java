import java.util.ArrayList;

public class Quizz {

	
		  public static int one(int a, int b){
		    return a*2*b;
		  }
		  public static int two(int a, int b){
		    return a*4;
		  }
		  public static int two(int a, int b, int c){
		    return a - b + c;
		  }
		  public static void main(String[] args){
		    int a = 1;
		    int b = 2;
		    int c = 3;
		    int three = one(a, b);
		    int four = two(three, two(a, b, c));
		    System.out.println(four);
		  }
		

}
