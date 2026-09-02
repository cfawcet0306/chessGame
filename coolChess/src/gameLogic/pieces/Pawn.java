package gameLogic.pieces;

import java.util.ArrayList;
import java.util.List;

import gameLogic.ChessBoard;
import gameLogic.Piece;
import gameLogic.Tile;


public class Pawn extends Piece {
	
	boolean hasMoved;

	public Pawn(Type pieceType, Tile position, Color pieceColor) {
		super(pieceType, position, pieceColor);
		this.hasMoved = false;
	}

	@Override
	public List<Tile> getValidMoves(ChessBoard board) {
		List<Tile> validMoves = new ArrayList<Tile>();
		
		
		
		
		return validMoves;
		
	}
	
	public void hasMoved() {
		this.hasMoved = true;
	}

	
	
	//TODO: figure out how you want the hasMoved variable to be changed, whether from board or pawn itself

}
