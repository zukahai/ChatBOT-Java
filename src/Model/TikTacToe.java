package Model;

public class TikTacToe {
	public char board[][] = {{ '_', '_', '_' },
				    		{ '_', '_', '_' },
				    		{ '_', '_', '_' }};
	public int bestval = -1;
	Minimax minimax = new Minimax();
	public TikTacToe() {
		if (Math.random() < 0.5)
			board[1][1] = 'o';
	}
	
	public void click(int x, int y) {
		if (board[x][y] == '_') {
			board[x][y] = 'x';
			if (minimax.isMovesLeft(board)) {
				Move move = minimax.findBestMove(board);
				bestval = minimax.bestVal;
				board[move.getRow()][move.getCol()] = 'o';
			}
		}
	}
}
