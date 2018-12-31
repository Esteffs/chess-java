package application;

import chess.ChessPiece;

public class UI 
{
	//Print pieces on board
	public static void printBoard(ChessPiece[][] pieces)
	{
		for (int i = 0; i < pieces.length; i++)
		{
			System.out.print((8 - i) + " "); //Number of columns
			for (int j = 0; j < pieces.length; j++)
			{
				printPiece(pieces[i][j]);
			}
			System.out.println(); //Add break line			
		}
		System.out.println("  a b c d e f g h");
	}
	
	//Print one piece
	private static void printPiece(ChessPiece piece)
	{
		if (piece == null)
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}