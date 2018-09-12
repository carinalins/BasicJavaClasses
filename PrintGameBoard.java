public class PrintGameBoard{
	
	public static void main (String[] args){
		
		
		int[][] board = new int[3][3];
		//GameBoard = new GameBoard();
		
		board[0][0] = 1;
		board[0][1] = 1;
		board[0][2] = 1;
		
		board[1][0] = 1;
		board[1][1] = 1;
		board[1][2] = 1;
		
		board[2][0] = 1;
		board[2][1] = 1;
		board[2][2] = 1;
		
		for (int i=0; i<3; i++){
			
			for (int j=0; j<3; j++){
				
				System.out.println(board[i][j]);
				
			}
		System.out.println();
		}
	}
}