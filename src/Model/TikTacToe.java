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
		if (minimax.evaluate(board) == 10)
			return;
		if (board[x][y] == '_') {
			board[x][y] = 'x';
			if (minimax.isMovesLeft(board)) {
				Move move = minimax.findBestMove(board);
				bestval = minimax.bestVal;
				board[move.getRow()][move.getCol()] = 'o';
			}
		}
	}
	
	public void newGame() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j] = '_';
		if (Math.random() < 0.5)
			board[1][1] = 'o';
	}
	
	public boolean isNull(int x, int y) {
		return board[x][y] == '_';
	}
	
	public int value() {
		return minimax.evaluate(board);
	}
}
