package com.quirko.logic.rotator;

import com.quirko.logic.MatrixOperations;

public final class NextShapeInfo {
	//@ public invariant shape != null;
	//@ public invariant position > 0;
		
    private /*@ spec_public @*/ final int[][] shape;
    private /*@ spec_public @*/ final int position;

    /*@ requires shape != null && position >0;
	 @  ensures this.position == position;
	 @  ensures this.shape == shape;
	 @*/
    
    public NextShapeInfo(final int[][] shape, final int position) {
        this.shape = shape;
        this.position = position;
    }

    
    public int[][] getShape() {
        return MatrixOperations.copy(shape);
    }

    public int getPosition() {
        return position;
    }
}
