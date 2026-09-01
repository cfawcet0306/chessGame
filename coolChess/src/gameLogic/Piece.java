package gameLogic;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
	
	private Type pieceType;
	
	private Tile position;
	
	private Color pieceColor;

	public enum Type { PAWN, KNIGHT, ROOK, BISHOP, QUEEN, KING }
	
	public enum Color { BLACK, WHITE }
	
	public Piece(Type pieceType, Tile position, Color pieceColor) {
		this.pieceType = pieceType;
		this.position = position;
		this.pieceColor = pieceColor;
	}
	
	public abstract boolean validMove(Tile desiredTile, Tile currentTile, int turn);
	
	public List<Tile> getValidMoves(Tile[][] board, int turn) {
		//Make a list
		List<Tile> validMoves = new ArrayList<Tile>();
		
		//Try every tile for a valid move
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(validMove(board[i][j], this.position, turn)) {
					validMoves.add(board[i][j]);
				}
				
			}
		}
		
		return validMoves;
	}
	
	public Type getType() {
		return this.pieceType;
	}
	
	public Tile getPosition() {
		return this.position;
	}
	
	public void movePiece(Tile position) {
		this.position = position;
	}
	
	public Color getColor() {
		return this.pieceColor;
	}
	
	
	
}
