package gameLogic;

public class Tile {

	/**
	 * The piece that currently occupies the tile
	 */
	private Piece currentPiece;
	
	/**
	 * The x position of the tile
	 */
	private int xPosition;
	
	/**
	 * The y position of the tile
	 */
	private int yPosition;
	
	
	/**
	 * Constructor for creating a new Tile object
	 * 
	 * @param x the x position of the new tile
	 * @param y the y position of the new tile
	 */
	public Tile(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;
		this.currentPiece = null;
	}
	
	/**
	 * Returns the piece that is currently in the tile
	 * 
	 * @return the specific piece that is in the tile
	 */
	public Piece getPiece() {
		return this.currentPiece;
	}
	
	/**
	 * Changes the tile to hold the specified piece
	 * 
	 * @param piece the new piece that is in this tile
	 */
	public void changePiece(Piece piece) {
		this.currentPiece = piece;
	}
	
	public int getX() {
		return this.xPosition;
	}
	
	public int getY() {
		return this.yPosition;
	}
	
}
