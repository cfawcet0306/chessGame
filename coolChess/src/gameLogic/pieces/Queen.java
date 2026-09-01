package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;

public class Queen extends Piece {

	public Queen(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public boolean validMove(Tile desiredTile, Tile currentTile, int turn) {
		//Just combine the rook and bishop behavior
		
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
		
		//If the x coord stays the same but the y changes, its cool
		//OR if the y coord stays the same but the x changes, its cool
		//BUT only if there is nothing there or its a diff color
		if((desiredTile.getX() - currentTile.getX() == 0 && desiredTile.getY() - currentTile.getY() != 0) 
				|| (desiredTile.getY() - currentTile.getY() == 0 && desiredTile.getX() - currentTile.getX() != 0)
				&& (desiredTile.getPiece() == null || desiredTile.getPiece().getColor() != this.getColor())) {
			return true;
		}
		
		
		//Otherwise say no
		return false;
	}


}
