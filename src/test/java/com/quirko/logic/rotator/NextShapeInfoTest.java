package com.quirko.logic.rotator;

import org.junit.Assert;
import org.junit.Test;

public class NextShapeInfoTest {

    @Test
    public void testGetShape() throws Exception {
        int[][] shape = new int[][]{{1, 2, 3}, {1, 2, 3}};
        int position = 3;
        NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
        nextShapeInfo.getShape()[0][0] = 23;
        Assert.assertEquals(1, nextShapeInfo.getShape()[0][0]);
    }

    @Test
    public void testGetPosition() throws Exception {
    	int[][] shape = new int[][]{{1, 2}, {1, 2}};
        int position = 2;
        NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
        nextShapeInfo.getPosition();
        Assert.assertEquals(2, nextShapeInfo.getPosition());
    }
        
        @Test
        public void testGetShape1() throws Exception {
            int[][] shape = new int[][]{{3, 2, 1}, {1, 2, 3}};
            int position = 3;
            NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
            nextShapeInfo.getShape()[0][0] = 32;
            Assert.assertEquals(3, nextShapeInfo.getShape()[0][0]);
        }

        @Test
        public void testGetPosition1() throws Exception {
        	int[][] shape = new int[][]{{1, 2, 3}, {1, 2, 3}};
            int position = 1;
            NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
            nextShapeInfo.getPosition();
            Assert.assertEquals(1, nextShapeInfo.getPosition());
        }
            @Test
            public void testGetShape2() throws Exception {
                int[][] shape = new int[][]{{1, 1, 1}, {2, 2, 3}};
                int position = 2;
                NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
                nextShapeInfo.getShape()[0][0] =11;
                Assert.assertEquals(1, nextShapeInfo.getShape()[0][0]);
            }

            @Test
            public void testGetPosition3() throws Exception {
            	int[][] shape = new int[][]{{2, 1}, {2, 2}};
                int position = 3;
                NextShapeInfo nextShapeInfo = new NextShapeInfo(shape, position);
                nextShapeInfo.getPosition();
                Assert.assertEquals(3, nextShapeInfo.getPosition());
                
    }
}
