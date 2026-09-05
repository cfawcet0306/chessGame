package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;

public class PieceFactory {

	private PieceFactory() {
		
	}
	
	public static Piece makePiece(Piece.Type type, Tile position, Piece.Color color) {
		if(type == Piece.Type.PAWN) {
			return new Pawn(type, position, color);
		}
		if(type == Piece.Type.BISHOP) {
			return new Bishop(type, position, color);
		}
		if(type == Piece.Type.ROOK) {
			return new Rook(type, position, color);
		}
		if(type == Piece.Type.KNIGHT) {
			return new Knight(type, position, color);
		}
		if(type == Piece.Type.QUEEN) {
			return new Queen(type, position, color);
		}
		if(type == Piece.Type.KING) {
			return new King(type, position, color);
		}
		
		return null;
	}
}
