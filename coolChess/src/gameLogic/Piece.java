package gameLogic;

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
	
	public abstract List<Tile> getValidMoves(ChessBoard board);
	
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
