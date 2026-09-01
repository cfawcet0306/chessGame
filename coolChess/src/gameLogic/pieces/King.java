package gameLogic.pieces;

import java.util.List;

import gameLogic.Piece;
import gameLogic.Tile;

public class King extends Piece {

	public King(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public List<Tile> getValidMoves(Tile[][] board, int turn) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
