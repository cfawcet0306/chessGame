package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;

public class Bishop extends Piece {

	public Bishop(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public boolean validMove(Tile desiredTile, Tile currentTile, int turn) {
		//Dont even bother if its not trying to move
		if(desiredTile == currentTile) {
			return false;
		}
		//If the change in x is the same magnitude as the change in y, all good
		//And theres nothing in that tile or its a diff color
		if(Math.abs((desiredTile.getX() - currentTile.getX()) / (desiredTile.getY() - currentTile.getY())) == 1
				&& (desiredTile.getPiece() == null || desiredTile.getPiece().getColor() != this.getColor())) {
			return true;
		}
		
		//Otherwise just say no
		return false;
	}


}
