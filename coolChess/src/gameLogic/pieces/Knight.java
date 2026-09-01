package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;

public class Knight extends Piece {

	public Knight(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public boolean validMove(Tile desiredTile, Tile currentTile, int turn) {
		//Dont even bother if its not trying to move
		if(desiredTile == currentTile) {
			return false;
		}
		
		//It can move 3 tiles total, but only when x is 2 and y is 1 or y is 2 and x is 1
		//And if either nothing or an enemy is there
		if(((Math.abs(desiredTile.getX() - currentTile.getX()) == 2 && Math.abs(desiredTile.getY() - currentTile.getY()) == 1)
				|| (Math.abs(desiredTile.getY() - currentTile.getY()) == 2 && Math.abs(desiredTile.getX() - currentTile.getX()) == 1))
				&& (desiredTile.getPiece() == null || desiredTile.getPiece().getColor() != this.getColor())) {
			return true;
		}
		
		//Otherwise just say no
		return false;
	}

	

}
