public class DoWhileTest{
	public static void main(String[] args){
		int counter = 5;
		int ans = 1;
		do{
			ans *= counter;
			counter--;
				
		}while(counter>0);
		System.out.println("Answer: " + ans);
	}
}

//counter=5 and ans=1, my ans= 5*1, counter->4//ans(5*1)*4//counter->3//ans(5*1)*4*3//counter->2//ans(5*1)*4*3*2//counter->1//ans(5*1)*4*3*2*1//counter->0//
//5! = 5x4x3x2x1// 8! = 8x7x6x5x4x3x2x1// 2! = 2x1//