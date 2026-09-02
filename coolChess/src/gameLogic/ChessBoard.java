package gameLogic;


/**
 * Class to have ease of use when working with tiles
 * while also restricting myself so as to error check
 * and not allow myself do things that might not work.
 */
public class ChessBoard {
	
	//Actual representation of the board
	Tile[][] board;
	
	public ChessBoard() {
		this.board = new Tile[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = new Tile(j, i);
			}
		}
	}
	
	public Tile getNorth(Tile currentTile) {
		//Don't go north out of bounds
		if(currentTile.getY() == 0) {
			return null;
		}
		
		//Otherwise its good
		return board[currentTile.getY() - 1][currentTile.getX()];
	}

	public Tile getEast(Tile currentTile) {
		//Don't go north out of bounds
		if(currentTile.getX() == 7) {
			return null;
		}
				
		//Otherwise its good
		return board[currentTile.getY()][currentTile.getX() + 1];
	}

	public Tile getSouth(Tile currentTile) {
		//Don't go north out of bounds
		if(currentTile.getY() == 7) {
			return null;
		}
				
		//Otherwise its good
		return board[currentTile.getY() + 1][currentTile.getX()];
	}
	
	public Tile getWest(Tile currentTile) {
		//Don't go north out of bounds
		if(currentTile.getX() == 0) {
			return null;
		}
				
		//Otherwise its good
		return board[currentTile.getY()][currentTile.getX() - 1];
	}
	
	public Tile getNorthEast(Tile currentTile) {
		//Don't do it if out of bounds
		if(currentTile.getX() == 7 || currentTile.getY() == 0) {
			return null;
		}
		
		//Otherwise all good
		return board[currentTile.getY() - 1][currentTile.getX() + 1];
	}
	
	public Tile getNorthWest(Tile currentTile) {
		//Don't do it if out of bounds
		if(currentTile.getX() == 0 || currentTile.getY() == 0) {
			return null;
		}
		
		//Otherwise all good
		return board[currentTile.getY() - 1][currentTile.getX() - 1];
	}
	
	public Tile getSouthEast(Tile currentTile) {
		//Don't do it if out of bounds
		if(currentTile.getX() == 7 || currentTile.getY() == 7) {
			return null;
		}
		
		//Otherwise all good
		return board[currentTile.getY() + 1][currentTile.getX() + 1];
	}
	
	public Tile getSouthWest(Tile currentTile) {
		//Don't do it if out of bounds
		if(currentTile.getX() == 0 || currentTile.getY() == 7) {
			return null;
		}
		
		//Otherwise all good
		return board[currentTile.getY() + 1][currentTile.getX() - 1];
	}
	
	public Tile getTile(int x, int y) {
		return board[y][x];
	}
	
	public Tile[][] getBoardArray() {
		return this.board;
	}
}
