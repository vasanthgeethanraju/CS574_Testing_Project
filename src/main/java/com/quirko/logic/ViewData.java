package com.quirko.logic;

public final class ViewData {
	
		//@ public invariant  brickData !=null;
		//@ public invariant  nextBrickData !=null;
	 	//@ public invariant  xPosition > 0;
		//@ public invariant  yPosition >0 ;

	
    private /*@ spec_public @*/ final int[][] brickData;
    private /*@ spec_public @*/ final int xPosition;
    private /*@ spec_public @*/ final int yPosition;
    private /*@ spec_public @*/ final int[][] nextBrickData;

    
    
    public ViewData(int[][] brickData, int xPosition, int yPosition, int[][] nextBrickData) {
        this.brickData = brickData;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.nextBrickData = nextBrickData;
    }

    public int[][] getBrickData() {
        return MatrixOperations.copy(brickData);
    }
    
    
    public int getxPosition() {
        return xPosition;
    }
    
    
    public int getyPosition() {
        return yPosition;
    }

    public int[][] getNextBrickData() {
        return MatrixOperations.copy(nextBrickData);
    }
}
