package gameLogic;

public class ChessBoardLogic {
	
	/**
	 * Array representation of the chess board
	 * (0, 0) is the top left of the board
	 * (7, 7) is the bottom right of the board
	 */
	private ChessBoard board;
	
	/**
	 * Current turn of the board (1 turn means white and black have gone)
	 */
	private int turn;
	
	public ChessBoardLogic() {
		this.board = new ChessBoard();
		this.turn = 1;
		
	}
	
	public boolean movePiece(Piece currentPiece, Tile position) {
		return false;
	}
	
	public int getTurn() {
		return this.turn;
	}
	
	public void nextTurn() {
		this.turn++;
	}
	
	public ChessBoard getBoard() {
		return this.board;
	}

}
