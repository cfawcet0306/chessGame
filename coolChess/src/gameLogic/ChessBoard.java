package gameLogic;

public class ChessBoard {
	
	/**
	 * Array representation of the chess board
	 * (0, 0) is the top left of the board
	 * (7, 7) is the bottom right of the board
	 */
	private Tile[][] board;
	
	/**
	 * Current turn of the board (1 turn means white and black have gone)
	 */
	private int turn;
	
	public ChessBoard() {
		board = new Tile[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = new Tile(j, i);
			}
		}
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
	
	public Tile[][] getBoard() {
		return this.board;
	}
	
	public Tile getTile(int x, int y) {
		return board[y][x];
	}
	
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if((board[i][j].getX() + board[i][j].getY()) % 2 == 0) {
					returnString.append('w');
				}
				else {
					returnString.append('b');
				}
			}
			returnString.append('\n');
		}
		
		return returnString.toString();
	}
	
	public String toStringWithCoords() {
		StringBuilder returnString = new StringBuilder();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				returnString.append("(" + board[i][j].getX() + "," + board[i][j].getY() + ")");
			}
			returnString.append('\n');
		}
		
		return returnString.toString();
	}
}
