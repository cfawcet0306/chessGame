package gameLogic.pieces;

import gameLogic.Piece;
import gameLogic.Tile;


public class Pawn extends Piece {

	public Pawn(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
	}

	@Override
	public boolean validMove(Tile desiredTile, Tile currentTile, int turn) {
		//Dont even bother if its not trying to move
		if(desiredTile == currentTile) {
			return false;
		}
		//It is black, moving down the board
		if(this.getColor() == Color.BLACK) {
			//Going down and nothing occupies there
			if(desiredTile.getY() - currentTile.getY() == 1 && desiredTile.getX() - currentTile.getX() == 0
					&& desiredTile.getPiece() == null) {
				return true;
			}
			//Going diag and something occupies there that is a diff color
			if(desiredTile.getY() - currentTile.getY() == 1 
					&& (desiredTile.getX() - currentTile.getX() == 1 || desiredTile.getX() - currentTile.getX() == -1 ) 
					&& desiredTile.getPiece() != null && desiredTile.getPiece().getColor() != this.getColor()) {
				return true;
			}
			//First turn and they wanna move two tiles
			if(turn == 1 
					&& desiredTile.getY() - currentTile.getY() == 2 && desiredTile.getX() - currentTile.getX() == 0
					&& desiredTile.getPiece() == null) {
				return true;
			}
			
		}
		//It is white, moving up the board
		else {
			//Going down and nothing occupies there
			if(desiredTile.getY() - currentTile.getY() == -1 && desiredTile.getX() - currentTile.getX() == 0
					&& desiredTile.getPiece() == null) {
				return true;
			}
			//Going diag and something occupies there that is a diff color
			if(desiredTile.getY() - currentTile.getY() == -1 
					&& (desiredTile.getX() - currentTile.getX() == 1 || desiredTile.getX() - currentTile.getX() == -1 ) 
					&& desiredTile.getPiece() != null && desiredTile.getPiece().getColor() != this.getColor()) {
				return true;
			}
			//First turn and they wanna move two tiles
			if(turn == 1 
					&& desiredTile.getY() - currentTile.getY() == -2 && desiredTile.getX() - currentTile.getX() == 0
					&& desiredTile.getPiece() == null) {
				return true;
			}
			
		}
		
		//Otherwise nah
		return false;
	}
	
	

}
