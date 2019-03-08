package com.quirko.logic;

public final class ClearRow {

	
		//@ public invariant  newMatrix !=null;
	 	//@ public invariant  linesRemoved > 0;
		//@ public invariant  scoreBonus >0 ;

    private /*@ spec_public @*/ final int linesRemoved;
    private /*@ spec_public @*/ final int[][] newMatrix;
    private /*@ spec_public @*/ final int scoreBonus;

   

    public ClearRow(int linesRemoved, int[][] newMatrix, int scoreBonus) {
  
        this.linesRemoved = linesRemoved;
        this.newMatrix = newMatrix;
        this.scoreBonus = scoreBonus;
    }

    public int getLinesRemoved() {
        return linesRemoved;
    }
 
    public int[][] getNewMatrix() {
        return MatrixOperations.copy(newMatrix);
    }
  

    public int getScoreBonus() {
        return scoreBonus;
    }
}
