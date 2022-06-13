package Model;

import java.util.Scanner;

public class Minimax{
	
	static char player = 'x', opponent = 'o';
	public int bestVal = -1;
 

	public Boolean isMovesLeft(char board[][]) {
	    for (int i = 0; i < 3; i++)
	        for (int j = 0; j < 3; j++)
	            if (board[i][j] == '_')
	                return true;
	    return false;
	}


	public int evaluate(char b[][]) {
	    for (int row = 0; row < 3; row++) {
	        if (b[row][0] == b[row][1] &&
	            b[row][1] == b[row][2]){
	            if (b[row][0] == opponent)
	                return +10;
	            else if (b[row][0] == player)
	                return -10;
	        }
	    }
	
	    for (int col = 0; col < 3; col++){
	        if (b[0][col] == b[1][col] &&
	            b[1][col] == b[2][col]){
	        	if (b[0][col] == opponent)
	                return +10;
	            else if (b[0][col] == player)
	                return -10;
	        }
	    }
	
	    if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
	        if (b[0][0] == opponent)
	            return +10;
	        else if (b[0][0] == player)
	            return -10;
	    }
	
	    if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
	        if (b[0][2] == opponent)
	            return +10;
	        else if (b[0][2] == player)
	            return -10;
	    }
	    return 0;
	}
 
	public int minimax(char board[][], int depth, Boolean isMax) {
		int score = evaluate(board);
	    if (score == 10)
	    	return score;
	    if (score == -10)
	    	return score;
	    if (isMovesLeft(board) == false)
	    	return 0;
	    
	    if (isMax){
	        int best = -1000;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++){
	            	if (board[i][j]=='_') {
	                    board[i][j] = opponent;
	                    best = Math.max(best, minimax(board, depth + 1, !isMax));
	                    board[i][j] = '_';
	                }
	            }
	        }
	
	        return best;
	    } else{
	        int best = 1000;
	        for (int i = 0; i < 3; i++){
	            for (int j = 0; j < 3; j++){
	                if (board[i][j] == '_'){
	                    board[i][j] = player;
	                    best = Math.min(best, minimax(board, depth + 1, !isMax));
	                    board[i][j] = '_';
	                }
	            }
	        }
	        return best;
	    }
	}


	public Move findBestMove(char board[][]){
	    bestVal = -1000;
	    Move bestMove = new Move();
	    bestMove.row = -1;
	    bestMove.col = -1;
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++){
	            if (board[i][j] == '_') {
	                board[i][j] = opponent;
	                int moveVal = minimax(board, 0, false);
	                board[i][j] = '_';
	                if (moveVal > bestVal){
	                    bestMove.row = i;
	                    bestMove.col = j;
	                    bestVal = moveVal;
	                }
	            }
	        }
	    }
	    if (board[1][1] == '_') {
	    	bestMove.col = bestMove.row = 1;
	    }
	
//	    System.out.printf("The value of the best Move " +  "is : %d\n\n", bestVal);
	    return bestMove;
	}
	
	public void display(char board[][]){
	    for (int i = 0; i < 3; i++) {
	    	for (int j = 0; j < 3; j++)
	    		System.out.print(board[i][j] + " ");
	    	System.out.println();
	    }
	    System.out.println();
	}
 
 
	public static void main(String[] args) {
	
	    char board[][] = {{ '_', '_', '_' },
	
				    		{ '_', '_', '_' },
				
				    		{ '_', '_', '_' }};
	 
	    Minimax m = new Minimax();
	   
	    while(m.isMovesLeft(board)) {
	    	 Move bestMove = m.findBestMove(board);
	    	 board[bestMove.row][bestMove.col] = m.opponent;
	    	 m.display(board);
	    	 Scanner sc = new Scanner(System.in);
	    	 int k1 = sc.nextInt();
	    	 int k2 = sc.nextInt();
	    	 board[k1][k2] = m.player;
	    }
	}
 
}