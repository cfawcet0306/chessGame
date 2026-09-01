package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;

public class King extends Piece {

	public King(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public boolean validMove(Tile desiredTile, Tile currentTile, int turn) {
		
		//Dont even bother if its not trying to move
		if(desiredTile == currentTile) {
			return false;
		}
		
		//One move in any direction
		//x is 1 y is 0, y is 1 x is 0, or x is 1 and y is 1
		//Only if no piece or enemy piece is there
		if(((Math.abs(desiredTile.getX() - currentTile.getX()) == 1 && Math.abs(desiredTile.getY() - currentTile.getY()) == 1)
				|| (Math.abs(desiredTile.getX() - currentTile.getX()) == 0 && Math.abs(desiredTile.getY() - currentTile.getY()) == 1)
				|| (Math.abs(desiredTile.getX() - currentTile.getX()) == 1 && Math.abs(desiredTile.getY() - currentTile.getY()) == 0))
				&& (desiredTile.getPiece() == null || desiredTile.getPiece().getColor() != this.getColor())) {
			return true;
		}
		
		//Otherwise just say no
		return false;
	}

	

}
