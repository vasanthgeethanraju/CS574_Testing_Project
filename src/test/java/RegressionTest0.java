
import org.junit.Test;
import org.junit.runners.MethodSorters;


public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        try {
            int[][] i_array_array31 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array24, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int[][] i_array_array0 = null;
        int[] i_array6 = new int[] { 100, (short) 0, '#', (byte) -1, (byte) 1 };
        int[] i_array12 = new int[] { 100, (short) 0, '#', (byte) -1, (byte) 1 };
        int[] i_array18 = new int[] { 100, (short) 0, '#', (byte) -1, (byte) 1 };
        int[][] i_array_array19 = new int[][] { i_array6, i_array12, i_array18 };
        try {
            boolean b22 = com.quirko.logic.MatrixOperations.intersect(i_array_array0, i_array_array19, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array_array19);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[][] i_array_array28 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        int[][] i_array_array29 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        try {
            int[][] i_array_array32 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array29, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        try {
            int[][] i_array_array21 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array16, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[] i_array12 = new int[] { '#', (short) -1 };
        int[] i_array15 = new int[] { '#', (short) -1 };
        int[] i_array18 = new int[] { '#', (short) -1 };
        int[] i_array21 = new int[] { '#', (short) -1 };
        int[][] i_array_array22 = new int[][] { i_array12, i_array15, i_array18, i_array21 };
        try {
            int[][] i_array_array25 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array22, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array_array22);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array17 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        int[] i_array29 = new int[] { (short) 1, (-1) };
        int[] i_array32 = new int[] { (short) 1, (-1) };
        int[][] i_array_array33 = new int[][] { i_array29, i_array32 };
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array33);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array33, (int) (byte) 10, 0);
        boolean b40 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array24, 0, (int) (byte) 100);
        try {
            boolean b43 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array17, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        int[] i_array34 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array39 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array40 = new int[][] { i_array34, i_array39 };
        boolean b43 = com.quirko.logic.MatrixOperations.intersect(i_array_array25, i_array_array40, (int) (byte) -1, (int) (byte) 1);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[][] i_array_array59 = new int[][] { i_array55, i_array58 };
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        boolean b63 = com.quirko.logic.MatrixOperations.intersect(i_array_array50, i_array_array59, (int) (byte) 10, 0);
        int[] i_array68 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array73 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array74 = new int[][] { i_array68, i_array73 };
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array59, i_array_array74, (int) (byte) -1, (int) (byte) 1);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array25, i_array_array74, (int) (byte) 100, (int) (byte) 1);
        try {
            int[][] i_array_array83 = com.quirko.logic.MatrixOperations.merge(i_array_array9, i_array_array74, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        int[][] i_array_array31 = com.quirko.logic.MatrixOperations.copy(i_array_array25);
        try {
            boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array25, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(i_array_array31);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[][] i_array_array35 = new int[][] { i_array31, i_array34 };
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array35, (int) (byte) 10, 0);
        int[] i_array44 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array49 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array50 = new int[][] { i_array44, i_array49 };
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array50, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        try {
            int[][] i_array_array58 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array50, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(i_array_array55);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        int[][] i_array_array31 = com.quirko.logic.MatrixOperations.copy(i_array_array25);
        try {
            int[][] i_array_array34 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array31, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(i_array_array31);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.List<int[][]> list_i_array_array0 = null;
        try {
            java.util.List<int[][]> list_i_array_array1 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array39, i_array_array51, 0, 10);
        try {
            int[][] i_array_array57 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array51, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[] i_array89 = new int[] { (short) 1, (-1) };
        int[] i_array92 = new int[] { (short) 1, (-1) };
        int[][] i_array_array93 = new int[][] { i_array89, i_array92 };
        com.quirko.logic.ClearRow clearRow94 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array93);
        com.quirko.logic.ClearRow clearRow95 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array93);
        try {
            int[][] i_array_array98 = com.quirko.logic.MatrixOperations.merge(i_array_array80, i_array_array93, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array89);
        org.junit.Assert.assertNotNull(i_array92);
        org.junit.Assert.assertNotNull(i_array_array93);
        org.junit.Assert.assertNotNull(clearRow94);
        org.junit.Assert.assertNotNull(clearRow95);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array41);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array63);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[] i_array80 = new int[] { (short) 1, (-1) };
        int[][] i_array_array81 = new int[][] { i_array77, i_array80 };
        com.quirko.logic.ClearRow clearRow82 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array81);
        boolean b85 = com.quirko.logic.MatrixOperations.intersect(i_array_array72, i_array_array81, (int) (byte) 10, 0);
        boolean b88 = com.quirko.logic.MatrixOperations.intersect(i_array_array65, i_array_array72, 0, (int) (byte) 100);
        boolean b91 = com.quirko.logic.MatrixOperations.intersect(i_array_array55, i_array_array72, (int) (short) 0, (int) (byte) 100);
        boolean b94 = com.quirko.logic.MatrixOperations.intersect(i_array_array46, i_array_array72, 0, (int) (byte) 100);
        try {
            int[][] i_array_array97 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array72, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array_array81);
        org.junit.Assert.assertNotNull(clearRow82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[] i_array73 = new int[] { (short) 1, (-1) };
        int[][] i_array_array74 = new int[][] { i_array70, i_array73 };
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array74);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array74);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array64, i_array_array76, 0, 10);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array76);
        try {
            int[][] i_array_array83 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array76, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(clearRow75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(i_array_array80);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array86);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[] i_array38 = new int[] { (short) 1, (-1) };
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[][] i_array_array42 = new int[][] { i_array38, i_array41 };
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[][] i_array_array59 = new int[][] { i_array55, i_array58 };
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        int[] i_array64 = new int[] { (short) 1, (-1) };
        int[] i_array67 = new int[] { (short) 1, (-1) };
        int[][] i_array_array68 = new int[][] { i_array64, i_array67 };
        com.quirko.logic.ClearRow clearRow69 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array68);
        boolean b72 = com.quirko.logic.MatrixOperations.intersect(i_array_array59, i_array_array68, (int) (byte) 10, 0);
        boolean b75 = com.quirko.logic.MatrixOperations.intersect(i_array_array52, i_array_array59, 0, (int) (byte) 100);
        boolean b78 = com.quirko.logic.MatrixOperations.intersect(i_array_array42, i_array_array59, (int) (short) 0, (int) (byte) 100);
        try {
            int[][] i_array_array81 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array42, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertNotNull(i_array64);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertNotNull(clearRow69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array62, (int) (byte) 10, 0);
        int[] i_array71 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array76 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array77 = new int[][] { i_array71, i_array76 };
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array62, i_array_array77, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow81 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array77);
        int[][] i_array_array82 = com.quirko.logic.MatrixOperations.copy(i_array_array77);
        int[][] i_array_array83 = com.quirko.logic.MatrixOperations.copy(i_array_array82);
        int[][] i_array_array84 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        try {
            int[][] i_array_array87 = com.quirko.logic.MatrixOperations.merge(i_array_array42, i_array_array84, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(i_array_array77);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(clearRow81);
        org.junit.Assert.assertNotNull(i_array_array82);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertNotNull(i_array_array84);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        boolean b27 = com.quirko.logic.MatrixOperations.intersect(i_array_array14, i_array_array23, (int) (byte) 10, 0);
        int[] i_array32 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array37 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array38 = new int[][] { i_array32, i_array37 };
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array38, (int) (byte) -1, (int) (byte) 1);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array50, 0, 10);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array50, (int) (byte) -1, 1);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        com.quirko.logic.ClearRow clearRow65 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        boolean b76 = com.quirko.logic.MatrixOperations.intersect(i_array_array63, i_array_array72, (int) (byte) 10, 0);
        int[] i_array81 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array86 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array87 = new int[][] { i_array81, i_array86 };
        boolean b90 = com.quirko.logic.MatrixOperations.intersect(i_array_array72, i_array_array87, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow91 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array87);
        int[][] i_array_array92 = com.quirko.logic.MatrixOperations.copy(i_array_array87);
        int[][] i_array_array93 = com.quirko.logic.MatrixOperations.copy(i_array_array92);
        int[][] i_array_array94 = com.quirko.logic.MatrixOperations.copy(i_array_array93);
        try {
            int[][] i_array_array97 = com.quirko.logic.MatrixOperations.merge(i_array_array50, i_array_array94, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(clearRow65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(i_array81);
        org.junit.Assert.assertNotNull(i_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(clearRow91);
        org.junit.Assert.assertNotNull(i_array_array92);
        org.junit.Assert.assertNotNull(i_array_array93);
        org.junit.Assert.assertNotNull(i_array_array94);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        try {
            int[][] i_array_array50 = com.quirko.logic.MatrixOperations.merge(i_array_array37, i_array_array47, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = null;
        try {
            boolean b90 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array87, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        int[] i_array34 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array39 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array40 = new int[][] { i_array34, i_array39 };
        boolean b43 = com.quirko.logic.MatrixOperations.intersect(i_array_array25, i_array_array40, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow44 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[][] i_array_array64 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        int[] i_array67 = new int[] { (short) 1, (-1) };
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[][] i_array_array71 = new int[][] { i_array67, i_array70 };
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        int[] i_array76 = new int[] { (short) 1, (-1) };
        int[] i_array79 = new int[] { (short) 1, (-1) };
        int[][] i_array_array80 = new int[][] { i_array76, i_array79 };
        com.quirko.logic.ClearRow clearRow81 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array80);
        boolean b84 = com.quirko.logic.MatrixOperations.intersect(i_array_array71, i_array_array80, (int) (byte) 10, 0);
        boolean b87 = com.quirko.logic.MatrixOperations.intersect(i_array_array64, i_array_array71, 0, (int) (byte) 100);
        boolean b90 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array71, (int) (short) 0, (int) (byte) 100);
        boolean b93 = com.quirko.logic.MatrixOperations.intersect(i_array_array45, i_array_array71, 0, (int) (byte) 100);
        try {
            int[][] i_array_array96 = com.quirko.logic.MatrixOperations.merge(i_array_array9, i_array_array71, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(clearRow44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(clearRow72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertNotNull(clearRow81);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[] i_array23 = new int[] {};
        int[][] i_array_array24 = new int[][] { i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[][] i_array_array41 = new int[][] { i_array37, i_array40 };
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array50, (int) (byte) 10, 0);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array34, i_array_array41, 0, (int) (byte) 100);
        boolean b60 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array41, (-1), 100);
        int[] i_array63 = new int[] { (short) 1, (-1) };
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[][] i_array_array67 = new int[][] { i_array63, i_array66 };
        com.quirko.logic.ClearRow clearRow68 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        com.quirko.logic.ClearRow clearRow69 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        int[] i_array72 = new int[] { (short) 1, (-1) };
        int[] i_array75 = new int[] { (short) 1, (-1) };
        int[][] i_array_array76 = new int[][] { i_array72, i_array75 };
        com.quirko.logic.ClearRow clearRow77 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array67, i_array_array76, (int) (byte) 10, 0);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array76, (int) (short) -1, 0);
        boolean b86 = com.quirko.logic.MatrixOperations.intersect(i_array_array22, i_array_array76, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertNotNull(clearRow68);
        org.junit.Assert.assertNotNull(clearRow69);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertNotNull(clearRow77);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b86 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        com.quirko.logic.ClearRow clearRow87 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(clearRow87);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int[][] i_array_array0 = null;
        int[] i_array3 = new int[] { (short) 1, (-1) };
        int[] i_array6 = new int[] { (short) 1, (-1) };
        int[][] i_array_array7 = new int[][] { i_array3, i_array6 };
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        boolean b20 = com.quirko.logic.MatrixOperations.intersect(i_array_array7, i_array_array16, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        try {
            int[][] i_array_array25 = com.quirko.logic.MatrixOperations.merge(i_array_array0, i_array_array22, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(i_array_array22);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int[][] i_array_array0 = null;
        try {
            com.quirko.logic.ClearRow clearRow1 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        boolean b60 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array53, (int) (short) -1, 0);
        int[] i_array63 = new int[] { (short) 1, (-1) };
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[][] i_array_array67 = new int[][] { i_array63, i_array66 };
        com.quirko.logic.ClearRow clearRow68 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        com.quirko.logic.ClearRow clearRow69 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        int[] i_array72 = new int[] { (short) 1, (-1) };
        int[] i_array75 = new int[] { (short) 1, (-1) };
        int[][] i_array_array76 = new int[][] { i_array72, i_array75 };
        com.quirko.logic.ClearRow clearRow77 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array67, i_array_array76, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow81 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        int[][] i_array_array82 = com.quirko.logic.MatrixOperations.copy(i_array_array76);
        com.quirko.logic.ClearRow clearRow83 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        try {
            int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array18, i_array_array76, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertNotNull(clearRow68);
        org.junit.Assert.assertNotNull(clearRow69);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertNotNull(clearRow77);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(clearRow81);
        org.junit.Assert.assertNotNull(i_array_array82);
        org.junit.Assert.assertNotNull(clearRow83);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[] i_array27 = new int[] { (short) 1, (-1) };
        int[][] i_array_array28 = new int[][] { i_array24, i_array27 };
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array28);
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array28);
        int[] i_array33 = new int[] { (short) 1, (-1) };
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[][] i_array_array37 = new int[][] { i_array33, i_array36 };
        com.quirko.logic.ClearRow clearRow38 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array37);
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array28, i_array_array37, (int) (byte) 10, 0);
        int[] i_array46 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array51 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array52 = new int[][] { i_array46, i_array51 };
        boolean b55 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array52, (int) (byte) -1, (int) (byte) 1);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[][] i_array_array64 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array52, i_array_array64, 0, 10);
        try {
            int[][] i_array_array70 = com.quirko.logic.MatrixOperations.merge(i_array_array17, i_array_array64, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(clearRow38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[][] i_array_array33 = null;
        try {
            boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array32, i_array_array33, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int[] i_array3 = new int[] { 100, (byte) 100, (short) 0 };
        int[] i_array7 = new int[] { 100, (byte) 100, (short) 0 };
        int[] i_array11 = new int[] { 100, (byte) 100, (short) 0 };
        int[] i_array15 = new int[] { 100, (byte) 100, (short) 0 };
        int[] i_array19 = new int[] { 100, (byte) 100, (short) 0 };
        int[] i_array23 = new int[] { 100, (byte) 100, (short) 0 };
        int[][] i_array_array24 = new int[][] { i_array3, i_array7, i_array11, i_array15, i_array19, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[][] i_array_array52 = new int[][] { i_array48, i_array51 };
        com.quirko.logic.ClearRow clearRow53 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[][] i_array_array61 = new int[][] { i_array57, i_array60 };
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[] i_array69 = new int[] { (short) 1, (-1) };
        int[][] i_array_array70 = new int[][] { i_array66, i_array69 };
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array70);
        boolean b74 = com.quirko.logic.MatrixOperations.intersect(i_array_array61, i_array_array70, (int) (byte) 10, 0);
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array61, 0, (int) (byte) 100);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array61, (int) (short) 0, (int) (byte) 100);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array61, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(clearRow53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int[][] i_array_array0 = null;
        int[] i_array3 = new int[] { (short) 1, (-1) };
        int[] i_array6 = new int[] { (short) 1, (-1) };
        int[][] i_array_array7 = new int[][] { i_array3, i_array6 };
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[][] i_array_array25 = com.quirko.logic.MatrixOperations.copy(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[][] i_array_array41 = new int[][] { i_array37, i_array40 };
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array32, i_array_array41, (int) (byte) 10, 0);
        boolean b48 = com.quirko.logic.MatrixOperations.intersect(i_array_array25, i_array_array32, 0, (int) (byte) 100);
        boolean b51 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array32, (int) (short) 0, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array7, i_array_array53, (int) (short) 10, 0);
        try {
            boolean b60 = com.quirko.logic.MatrixOperations.intersect(i_array_array0, i_array_array7, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int[][] i_array_array0 = null;
        try {
            int[][] i_array_array1 = com.quirko.logic.MatrixOperations.copy(i_array_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        com.quirko.logic.ClearRow clearRow38 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[][] i_array_array39 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(clearRow38);
        org.junit.Assert.assertNotNull(i_array_array39);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array9 = new int[] {};
        int[][] i_array_array10 = new int[][] { i_array9 };
        com.quirko.logic.ClearRow clearRow11 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array10);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        int[] i_array32 = new int[] { (short) 1, (-1) };
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[][] i_array_array36 = new int[][] { i_array32, i_array35 };
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        boolean b40 = com.quirko.logic.MatrixOperations.intersect(i_array_array27, i_array_array36, (int) (byte) 10, 0);
        boolean b43 = com.quirko.logic.MatrixOperations.intersect(i_array_array20, i_array_array27, 0, (int) (byte) 100);
        boolean b46 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array27, (-1), 100);
        try {
            int[][] i_array_array49 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array27, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(clearRow11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[][] i_array_array52 = new int[][] { i_array48, i_array51 };
        com.quirko.logic.ClearRow clearRow53 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[][] i_array_array61 = new int[][] { i_array57, i_array60 };
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[] i_array69 = new int[] { (short) 1, (-1) };
        int[][] i_array_array70 = new int[][] { i_array66, i_array69 };
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array70);
        boolean b74 = com.quirko.logic.MatrixOperations.intersect(i_array_array61, i_array_array70, (int) (byte) 10, 0);
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array61, 0, (int) (byte) 100);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array61, (int) (short) 0, (int) (byte) 100);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array61, 0, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow84 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[][] i_array_array85 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.copy(i_array_array85);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(clearRow53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(clearRow84);
        org.junit.Assert.assertNotNull(i_array_array85);
        org.junit.Assert.assertNotNull(i_array_array86);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[] i_array38 = new int[] { (short) 1, (-1) };
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[][] i_array_array42 = new int[][] { i_array38, i_array41 };
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        int[][] i_array_array56 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array45, i_array_array53, (int) (byte) -1, 0);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        try {
            int[][] i_array_array63 = com.quirko.logic.MatrixOperations.merge(i_array_array30, i_array_array45, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(i_array_array56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array41, (int) (short) 10, (int) (byte) 0);
        int[][] i_array_array60 = null;
        try {
            boolean b63 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array60, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[][] i_array_array29 = new int[][] { i_array25, i_array28 };
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        com.quirko.logic.ClearRow clearRow31 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[][] i_array_array38 = new int[][] { i_array34, i_array37 };
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array29, i_array_array38, (int) (byte) 10, 0);
        int[] i_array47 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array52 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array53 = new int[][] { i_array47, i_array52 };
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array53, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow57 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[][] i_array_array58 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        int[][] i_array_array59 = com.quirko.logic.MatrixOperations.copy(i_array_array58);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array59);
        int[] i_array63 = new int[] { (short) 1, (-1) };
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[][] i_array_array67 = new int[][] { i_array63, i_array66 };
        com.quirko.logic.ClearRow clearRow68 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        int[][] i_array_array69 = com.quirko.logic.MatrixOperations.copy(i_array_array67);
        int[][] i_array_array70 = com.quirko.logic.MatrixOperations.copy(i_array_array69);
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array70);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        boolean b82 = com.quirko.logic.MatrixOperations.intersect(i_array_array70, i_array_array78, 0, (int) '#');
        int[][] i_array_array83 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        com.quirko.logic.ClearRow clearRow84 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        boolean b87 = com.quirko.logic.MatrixOperations.intersect(i_array_array60, i_array_array78, (int) (short) -1, (int) (byte) 100);
        int[][] i_array_array88 = com.quirko.logic.MatrixOperations.copy(i_array_array60);
        try {
            int[][] i_array_array91 = com.quirko.logic.MatrixOperations.merge(i_array_array21, i_array_array60, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(clearRow31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(clearRow57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertNotNull(clearRow68);
        org.junit.Assert.assertNotNull(i_array_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertNotNull(clearRow84);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(i_array_array88);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[][] i_array_array64 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        int[] i_array67 = new int[] { (short) 1, (-1) };
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[][] i_array_array71 = new int[][] { i_array67, i_array70 };
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        int[] i_array76 = new int[] { (short) 1, (-1) };
        int[] i_array79 = new int[] { (short) 1, (-1) };
        int[][] i_array_array80 = new int[][] { i_array76, i_array79 };
        com.quirko.logic.ClearRow clearRow81 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array80);
        boolean b84 = com.quirko.logic.MatrixOperations.intersect(i_array_array71, i_array_array80, (int) (byte) 10, 0);
        boolean b87 = com.quirko.logic.MatrixOperations.intersect(i_array_array64, i_array_array71, 0, (int) (byte) 100);
        boolean b90 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array71, (int) (short) 0, (int) (byte) 100);
        int[][] i_array_array91 = com.quirko.logic.MatrixOperations.copy(i_array_array71);
        try {
            int[][] i_array_array94 = com.quirko.logic.MatrixOperations.merge(i_array_array46, i_array_array71, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(clearRow72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(i_array76);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertNotNull(clearRow81);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(i_array_array91);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        int[] i_array32 = new int[] { (short) 1, (-1) };
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[][] i_array_array36 = new int[][] { i_array32, i_array35 };
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        boolean b40 = com.quirko.logic.MatrixOperations.intersect(i_array_array27, i_array_array36, (int) (byte) 10, 0);
        try {
            int[][] i_array_array43 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array27, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow66 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array65);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(clearRow66);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[][] i_array_array38 = new int[][] { i_array34, i_array37 };
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[][] i_array_array47 = new int[][] { i_array43, i_array46 };
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        boolean b51 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array47, (int) (byte) 10, 0);
        int[] i_array56 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array61 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array62 = new int[][] { i_array56, i_array61 };
        boolean b65 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array62, (int) (byte) -1, (int) (byte) 1);
        try {
            int[][] i_array_array68 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array47, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[][] i_array_array18 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array19);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array19, i_array_array27, 0, (int) '#');
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array27);
        try {
            boolean b35 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array32, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        int[][] i_array_array35 = null;
        try {
            boolean b38 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array35, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array_array34);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array80);
        com.quirko.logic.ClearRow clearRow88 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array87);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
        org.junit.Assert.assertNotNull(clearRow88);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        try {
            int[][] i_array_array33 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array16, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(clearRow30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[][] i_array_array18 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array19);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array19, i_array_array27, 0, (int) '#');
        try {
            int[][] i_array_array34 = com.quirko.logic.MatrixOperations.merge(i_array_array9, i_array_array27, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[][] i_array_array28 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[][] i_array_array35 = new int[][] { i_array31, i_array34 };
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        boolean b48 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array44, (int) (byte) 10, 0);
        boolean b51 = com.quirko.logic.MatrixOperations.intersect(i_array_array28, i_array_array35, 0, (int) (byte) 100);
        try {
            int[][] i_array_array54 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array28, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[] i_array38 = new int[] { (short) 1, (-1) };
        int[][] i_array_array39 = new int[][] { i_array35, i_array38 };
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array41 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array41);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array42, i_array_array50, 0, (int) '#');
        try {
            int[][] i_array_array57 = com.quirko.logic.MatrixOperations.merge(i_array_array32, i_array_array42, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int[][] i_array_array0 = null;
        int[] i_array3 = new int[] { (short) 1, (-1) };
        int[] i_array6 = new int[] { (short) 1, (-1) };
        int[][] i_array_array7 = new int[][] { i_array3, i_array6 };
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array7);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        boolean b32 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array16, 0, (int) (byte) 100);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array33);
        try {
            boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array0, i_array_array34, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array_array34);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow65 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(clearRow65);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        boolean b23 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, (int) (byte) -1, 0);
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(clearRow24);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int[][] i_array_array0 = null;
        int[] i_array3 = new int[] { (short) 1, (-1) };
        int[] i_array6 = new int[] { (short) 1, (-1) };
        int[][] i_array_array7 = new int[][] { i_array3, i_array6 };
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array7);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        boolean b20 = com.quirko.logic.MatrixOperations.intersect(i_array_array7, i_array_array16, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array22);
        try {
            int[][] i_array_array26 = com.quirko.logic.MatrixOperations.merge(i_array_array0, i_array_array22, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array6);
        org.junit.Assert.assertNotNull(i_array_array7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(clearRow23);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[][] i_array_array52 = new int[][] { i_array48, i_array51 };
        com.quirko.logic.ClearRow clearRow53 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array55, 100, (int) ' ');
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(clearRow53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow11 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array10);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array20);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[][] i_array_array29 = new int[][] { i_array25, i_array28 };
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array21, i_array_array29, 0, (int) '#');
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array29);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array29, (int) (short) 0, (int) 'a');
        com.quirko.logic.ClearRow clearRow38 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array10);
        int[][] i_array_array39 = null;
        try {
            int[][] i_array_array42 = com.quirko.logic.MatrixOperations.merge(i_array_array10, i_array_array39, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(clearRow11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(clearRow38);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        boolean b27 = com.quirko.logic.MatrixOperations.intersect(i_array_array14, i_array_array23, (int) (byte) 10, 0);
        int[] i_array32 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array37 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array38 = new int[][] { i_array32, i_array37 };
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array38, (int) (byte) -1, (int) (byte) 1);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array50, 0, 10);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array50, (int) (byte) -1, 1);
        int[][] i_array_array57 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array_array57);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array63, (int) (byte) 10, 0);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array54, 0, (int) (byte) 100);
        boolean b73 = com.quirko.logic.MatrixOperations.intersect(i_array_array36, i_array_array54, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array19);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array20);
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[] i_array27 = new int[] { (short) 1, (-1) };
        int[][] i_array_array28 = new int[][] { i_array24, i_array27 };
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array28);
        boolean b32 = com.quirko.logic.MatrixOperations.intersect(i_array_array20, i_array_array28, 0, (int) '#');
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array28, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(i_array_array35);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array63, (int) (byte) 10, 0);
        int[] i_array72 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array77 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array78 = new int[][] { i_array72, i_array77 };
        boolean b81 = com.quirko.logic.MatrixOperations.intersect(i_array_array63, i_array_array78, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow82 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array83 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        int[][] i_array_array84 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        try {
            int[][] i_array_array87 = com.quirko.logic.MatrixOperations.merge(i_array_array42, i_array_array83, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(clearRow82);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertNotNull(i_array_array84);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array80);
        int[][] i_array_array88 = com.quirko.logic.MatrixOperations.copy(i_array_array87);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
        org.junit.Assert.assertNotNull(i_array_array88);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array_array34);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[] i_array39 = new int[] {};
        int[][] i_array_array40 = new int[][] { i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[] i_array56 = new int[] { (short) 1, (-1) };
        int[][] i_array_array57 = new int[][] { i_array53, i_array56 };
        com.quirko.logic.ClearRow clearRow58 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[] i_array65 = new int[] { (short) 1, (-1) };
        int[][] i_array_array66 = new int[][] { i_array62, i_array65 };
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array66);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array57, i_array_array66, (int) (byte) 10, 0);
        boolean b73 = com.quirko.logic.MatrixOperations.intersect(i_array_array50, i_array_array57, 0, (int) (byte) 100);
        boolean b76 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array57, (-1), 100);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array40, (int) (short) 10, (int) (short) 10);
        com.quirko.logic.ClearRow clearRow80 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(clearRow58);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(clearRow80);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array8 = new int[] {};
        int[][] i_array_array9 = new int[][] { i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[][] i_array_array35 = new int[][] { i_array31, i_array34 };
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array35, (int) (byte) 10, 0);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array19, i_array_array26, 0, (int) (byte) 100);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array26, (-1), 100);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array62, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[][] i_array_array68 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        com.quirko.logic.ClearRow clearRow69 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        boolean b72 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array62, (int) (short) -1, 10);
        try {
            int[][] i_array_array75 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array26, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertNotNull(clearRow69);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[][] i_array_array38 = new int[][] { i_array34, i_array37 };
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[][] i_array_array47 = new int[][] { i_array43, i_array46 };
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        boolean b51 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array47, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array47);
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        try {
            int[][] i_array_array58 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array53, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(i_array_array55);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        com.quirko.logic.ClearRow clearRow11 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array10);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array22);
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[] i_array29 = new int[] { (short) 1, (-1) };
        int[][] i_array_array30 = new int[][] { i_array26, i_array29 };
        com.quirko.logic.ClearRow clearRow31 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array33);
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[][] i_array_array41 = new int[][] { i_array37, i_array40 };
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array33, i_array_array41, 0, (int) '#');
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array41);
        boolean b49 = com.quirko.logic.MatrixOperations.intersect(i_array_array22, i_array_array41, (int) (short) 0, (int) 'a');
        try {
            int[][] i_array_array52 = com.quirko.logic.MatrixOperations.merge(i_array_array10, i_array_array41, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(clearRow11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(clearRow23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertNotNull(clearRow31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int[][] i_array_array0 = new int[][] {};
        try {
            com.quirko.logic.ClearRow clearRow1 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array_array0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        int[] i_array32 = new int[] { (short) 1, (-1) };
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[][] i_array_array36 = new int[][] { i_array32, i_array35 };
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        boolean b40 = com.quirko.logic.MatrixOperations.intersect(i_array_array27, i_array_array36, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        boolean b46 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array36, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array48 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[][] i_array_array56 = new int[][] { i_array52, i_array55 };
        com.quirko.logic.ClearRow clearRow57 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array56);
        int[][] i_array_array58 = com.quirko.logic.MatrixOperations.copy(i_array_array56);
        int[][] i_array_array59 = com.quirko.logic.MatrixOperations.copy(i_array_array56);
        boolean b62 = com.quirko.logic.MatrixOperations.intersect(i_array_array48, i_array_array56, (int) (byte) -1, 0);
        try {
            int[][] i_array_array65 = com.quirko.logic.MatrixOperations.merge(i_array_array38, i_array_array56, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array_array56);
        org.junit.Assert.assertNotNull(clearRow57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        boolean b27 = com.quirko.logic.MatrixOperations.intersect(i_array_array14, i_array_array23, (int) (byte) 10, 0);
        int[] i_array32 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array37 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array38 = new int[][] { i_array32, i_array37 };
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array38, (int) (byte) -1, (int) (byte) 1);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array50, 0, 10);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array50, (int) (byte) -1, 1);
        int[][] i_array_array57 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[] i_array63 = new int[] { (short) 1, (-1) };
        int[][] i_array_array64 = new int[][] { i_array60, i_array63 };
        com.quirko.logic.ClearRow clearRow65 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        int[][] i_array_array66 = com.quirko.logic.MatrixOperations.copy(i_array_array64);
        int[][] i_array_array67 = com.quirko.logic.MatrixOperations.copy(i_array_array66);
        com.quirko.logic.ClearRow clearRow68 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[][] i_array_array75 = new int[][] { i_array71, i_array74 };
        com.quirko.logic.ClearRow clearRow76 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array67, i_array_array75, 0, (int) '#');
        try {
            int[][] i_array_array82 = com.quirko.logic.MatrixOperations.merge(i_array_array50, i_array_array67, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertNotNull(clearRow65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertNotNull(clearRow68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertNotNull(clearRow76);
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[][] i_array_array41 = new int[][] { i_array37, i_array40 };
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array50, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array50, (int) '#', 0);
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(clearRow60);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        int[][] i_array_array51 = null;
        try {
            int[][] i_array_array54 = com.quirko.logic.MatrixOperations.merge(i_array_array47, i_array_array51, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(clearRow40);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        try {
            int[][] i_array_array44 = com.quirko.logic.MatrixOperations.merge(i_array_array8, i_array_array40, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        int[][] i_array_array24 = com.quirko.logic.MatrixOperations.copy(i_array_array21);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(clearRow23);
        org.junit.Assert.assertNotNull(i_array_array24);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[][] i_array_array16 = com.quirko.logic.MatrixOperations.copy(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array32, (int) (byte) 10, 0);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array23, 0, (int) (byte) 100);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array23, (int) (short) 0, (int) (byte) 100);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        try {
            boolean b55 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array49, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array41, (int) (short) 10, (int) (byte) 0);
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[] i_array65 = new int[] { (short) 1, (-1) };
        int[][] i_array_array66 = new int[][] { i_array62, i_array65 };
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array66);
        int[][] i_array_array68 = com.quirko.logic.MatrixOperations.copy(i_array_array66);
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[][] i_array_array75 = new int[][] { i_array71, i_array74 };
        com.quirko.logic.ClearRow clearRow76 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        com.quirko.logic.ClearRow clearRow77 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        int[] i_array80 = new int[] { (short) 1, (-1) };
        int[] i_array83 = new int[] { (short) 1, (-1) };
        int[][] i_array_array84 = new int[][] { i_array80, i_array83 };
        com.quirko.logic.ClearRow clearRow85 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array84);
        boolean b88 = com.quirko.logic.MatrixOperations.intersect(i_array_array75, i_array_array84, (int) (byte) 10, 0);
        boolean b91 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array75, 0, (int) (byte) 100);
        int[][] i_array_array92 = com.quirko.logic.MatrixOperations.copy(i_array_array68);
        boolean b95 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array68, 1, (int) (short) 10);
        int[][] i_array_array96 = com.quirko.logic.MatrixOperations.copy(i_array_array10);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertNotNull(clearRow76);
        org.junit.Assert.assertNotNull(clearRow77);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array83);
        org.junit.Assert.assertNotNull(i_array_array84);
        org.junit.Assert.assertNotNull(clearRow85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(i_array_array92);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertNotNull(i_array_array96);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[][] i_array_array16 = com.quirko.logic.MatrixOperations.copy(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array32, (int) (byte) 10, 0);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array23, 0, (int) (byte) 100);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array23, (int) (short) 0, (int) (byte) 100);
        int[][] i_array_array43 = com.quirko.logic.MatrixOperations.copy(i_array_array23);
        int[] i_array46 = new int[] { (short) 1, (-1) };
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[][] i_array_array50 = new int[][] { i_array46, i_array49 };
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[][] i_array_array59 = new int[][] { i_array55, i_array58 };
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        boolean b63 = com.quirko.logic.MatrixOperations.intersect(i_array_array50, i_array_array59, (int) (byte) 10, 0);
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array43, i_array_array59, (int) '#', 10);
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[] i_array73 = new int[] { (short) 1, (-1) };
        int[][] i_array_array74 = new int[][] { i_array70, i_array73 };
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array74);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array74);
        com.quirko.logic.ClearRow clearRow77 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        int[][] i_array_array78 = com.quirko.logic.MatrixOperations.copy(i_array_array76);
        int[][] i_array_array79 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        try {
            int[][] i_array_array82 = com.quirko.logic.MatrixOperations.merge(i_array_array59, i_array_array78, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array_array43);
        org.junit.Assert.assertNotNull(i_array46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(clearRow75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertNotNull(clearRow77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(i_array_array79);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array41);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array41);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array63);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[] i_array80 = new int[] { (short) 1, (-1) };
        int[][] i_array_array81 = new int[][] { i_array77, i_array80 };
        com.quirko.logic.ClearRow clearRow82 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array81);
        boolean b85 = com.quirko.logic.MatrixOperations.intersect(i_array_array72, i_array_array81, (int) (byte) 10, 0);
        boolean b88 = com.quirko.logic.MatrixOperations.intersect(i_array_array65, i_array_array72, 0, (int) (byte) 100);
        boolean b91 = com.quirko.logic.MatrixOperations.intersect(i_array_array55, i_array_array72, (int) (short) 0, (int) (byte) 100);
        boolean b94 = com.quirko.logic.MatrixOperations.intersect(i_array_array46, i_array_array72, 0, (int) (byte) 100);
        try {
            int[][] i_array_array97 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array46, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array_array81);
        org.junit.Assert.assertNotNull(clearRow82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[] i_array21 = new int[] { (short) 1, (-1) };
        int[] i_array24 = new int[] { (short) 1, (-1) };
        int[][] i_array_array25 = new int[][] { i_array21, i_array24 };
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        boolean b29 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array25, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        int[][] i_array_array31 = com.quirko.logic.MatrixOperations.copy(i_array_array25);
        com.quirko.logic.ClearRow clearRow32 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array31);
        try {
            int[][] i_array_array35 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array31, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array21);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(clearRow32);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[][] i_array_array52 = new int[][] { i_array48, i_array51 };
        com.quirko.logic.ClearRow clearRow53 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[][] i_array_array61 = new int[][] { i_array57, i_array60 };
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[] i_array69 = new int[] { (short) 1, (-1) };
        int[][] i_array_array70 = new int[][] { i_array66, i_array69 };
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array70);
        boolean b74 = com.quirko.logic.MatrixOperations.intersect(i_array_array61, i_array_array70, (int) (byte) 10, 0);
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array61, 0, (int) (byte) 100);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array61, (int) (short) 0, (int) (byte) 100);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array61, 0, (int) (byte) 100);
        int[][] i_array_array84 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(clearRow53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array84);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        com.quirko.logic.ClearRow clearRow87 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array80);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(clearRow87);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[] i_array39 = new int[] {};
        int[][] i_array_array40 = new int[][] { i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[] i_array56 = new int[] { (short) 1, (-1) };
        int[][] i_array_array57 = new int[][] { i_array53, i_array56 };
        com.quirko.logic.ClearRow clearRow58 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[] i_array65 = new int[] { (short) 1, (-1) };
        int[][] i_array_array66 = new int[][] { i_array62, i_array65 };
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array66);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array57, i_array_array66, (int) (byte) 10, 0);
        boolean b73 = com.quirko.logic.MatrixOperations.intersect(i_array_array50, i_array_array57, 0, (int) (byte) 100);
        boolean b76 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array57, (-1), 100);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array40, (int) (short) 10, (int) (short) 10);
        com.quirko.logic.ClearRow clearRow80 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array81 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(clearRow58);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(clearRow80);
        org.junit.Assert.assertNotNull(i_array_array81);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        try {
            int[][] i_array_array48 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array45, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array_array45);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int[] i_array3 = new int[] { (short) 100, (byte) 10, '4' };
        int[][] i_array_array4 = new int[][] { i_array3 };
        int[] i_array7 = new int[] { (short) 1, (-1) };
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[][] i_array_array11 = new int[][] { i_array7, i_array10 };
        com.quirko.logic.ClearRow clearRow12 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array11);
        int[][] i_array_array13 = com.quirko.logic.MatrixOperations.copy(i_array_array11);
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[][] i_array_array20 = new int[][] { i_array16, i_array19 };
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array20);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array20);
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[][] i_array_array29 = new int[][] { i_array25, i_array28 };
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array20, i_array_array29, (int) (byte) 10, 0);
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array43 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array44 = new int[][] { i_array38, i_array43 };
        boolean b47 = com.quirko.logic.MatrixOperations.intersect(i_array_array29, i_array_array44, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        boolean b55 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array52, (int) (byte) 1, (int) '4');
        try {
            boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array4, i_array_array11, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(i_array_array4);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(clearRow12);
        org.junit.Assert.assertNotNull(i_array_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array37);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array65, i_array_array76, 0, (int) (byte) 0);
        com.quirko.logic.ClearRow clearRow80 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array76);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(clearRow75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(clearRow80);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array37);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array65, i_array_array76, 0, (int) (byte) 0);
        com.quirko.logic.ClearRow clearRow80 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array65);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(clearRow75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(clearRow80);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array23 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array64, (int) (byte) 100, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertNotNull(clearRow72);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array45, i_array_array54, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array54);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array54, (int) (short) -1, 10);
        int[][] i_array_array65 = null;
        try {
            boolean b68 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array65, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        boolean b60 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array53, (int) (short) -1, 0);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(clearRow61);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        boolean b23 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, (int) (byte) -1, 0);
        int[][] i_array_array24 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array27 = new int[] { (short) 1, (-1) };
        int[] i_array30 = new int[] { (short) 1, (-1) };
        int[][] i_array_array31 = new int[][] { i_array27, i_array30 };
        com.quirko.logic.ClearRow clearRow32 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array31);
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array31);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array31, i_array_array40, (int) (byte) 10, 0);
        int[] i_array49 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array54 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array55 = new int[][] { i_array49, i_array54 };
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array55, (int) (byte) -1, (int) (byte) 1);
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[] i_array64 = new int[] { (short) 1, (-1) };
        int[][] i_array_array65 = new int[][] { i_array61, i_array64 };
        com.quirko.logic.ClearRow clearRow66 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array65);
        int[][] i_array_array67 = com.quirko.logic.MatrixOperations.copy(i_array_array65);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array55, i_array_array67, 0, 10);
        int[][] i_array_array71 = com.quirko.logic.MatrixOperations.copy(i_array_array67);
        boolean b74 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array67, (int) (short) 0, (int) '#');
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(clearRow32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(clearRow66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(clearRow75);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array48 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        try {
            int[][] i_array_array52 = com.quirko.logic.MatrixOperations.merge(i_array_array36, i_array_array49, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array37);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[][] i_array_array74 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        int[][] i_array_array75 = com.quirko.logic.MatrixOperations.copy(i_array_array74);
        com.quirko.logic.ClearRow clearRow76 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        int[] i_array79 = new int[] { (short) 1, (-1) };
        int[] i_array82 = new int[] { (short) 1, (-1) };
        int[][] i_array_array83 = new int[][] { i_array79, i_array82 };
        com.quirko.logic.ClearRow clearRow84 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array83);
        boolean b87 = com.quirko.logic.MatrixOperations.intersect(i_array_array75, i_array_array83, 0, (int) '#');
        int[][] i_array_array88 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        com.quirko.logic.ClearRow clearRow89 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array83);
        int[][] i_array_array90 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        try {
            int[][] i_array_array93 = com.quirko.logic.MatrixOperations.merge(i_array_array37, i_array_array90, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertNotNull(clearRow76);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(i_array82);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertNotNull(clearRow84);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(i_array_array88);
        org.junit.Assert.assertNotNull(clearRow89);
        org.junit.Assert.assertNotNull(i_array_array90);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array62, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[][] i_array_array68 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        try {
            int[][] i_array_array71 = com.quirko.logic.MatrixOperations.merge(i_array_array42, i_array_array62, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertNotNull(i_array_array68);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[][] i_array_array16 = com.quirko.logic.MatrixOperations.copy(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array32, (int) (byte) 10, 0);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array23, 0, (int) (byte) 100);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array23, (int) (short) 0, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array23);
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(clearRow47);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[] i_array61 = new int[] { (short) 1, (-1) };
        int[][] i_array_array62 = new int[][] { i_array58, i_array61 };
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array62);
        int[] i_array67 = new int[] { (short) 1, (-1) };
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[][] i_array_array71 = new int[][] { i_array67, i_array70 };
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        boolean b75 = com.quirko.logic.MatrixOperations.intersect(i_array_array62, i_array_array71, (int) (byte) 10, 0);
        boolean b78 = com.quirko.logic.MatrixOperations.intersect(i_array_array55, i_array_array62, 0, (int) (byte) 100);
        boolean b81 = com.quirko.logic.MatrixOperations.intersect(i_array_array45, i_array_array62, (int) (short) 0, (int) (byte) 100);
        int[][] i_array_array82 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        int[][] i_array_array83 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        boolean b86 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array62, 10, 0);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(clearRow72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(i_array_array82);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertTrue(b86 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        com.quirko.logic.ClearRow clearRow38 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(clearRow38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array53, (int) '#', 10);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array10);
        int[][] i_array_array61 = com.quirko.logic.MatrixOperations.copy(i_array_array60);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array39, i_array_array51, 0, 10);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array55, (int) '#', (int) '4');
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(clearRow59);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[][] i_array_array16 = com.quirko.logic.MatrixOperations.copy(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array32, (int) (byte) 10, 0);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array23, 0, (int) (byte) 100);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array23, (int) (short) 0, (int) (byte) 100);
        int[][] i_array_array43 = com.quirko.logic.MatrixOperations.copy(i_array_array23);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array23);
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[][] i_array_array16 = com.quirko.logic.MatrixOperations.copy(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[][] i_array_array32 = new int[][] { i_array28, i_array31 };
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array32);
        boolean b36 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array32, (int) (byte) 10, 0);
        boolean b39 = com.quirko.logic.MatrixOperations.intersect(i_array_array16, i_array_array23, 0, (int) (byte) 100);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array23, (int) (short) 0, (int) (byte) 100);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[][] i_array_array58 = new int[][] { i_array54, i_array57 };
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array58);
        boolean b62 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array58, (int) (byte) 10, 0);
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array72 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array73 = new int[][] { i_array67, i_array72 };
        boolean b76 = com.quirko.logic.MatrixOperations.intersect(i_array_array58, i_array_array73, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array77 = com.quirko.logic.MatrixOperations.copy(i_array_array58);
        com.quirko.logic.ClearRow clearRow78 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array58);
        int[][] i_array_array79 = com.quirko.logic.MatrixOperations.copy(i_array_array58);
        try {
            int[][] i_array_array82 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array79, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(clearRow51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array_array73);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(i_array_array77);
        org.junit.Assert.assertNotNull(clearRow78);
        org.junit.Assert.assertNotNull(i_array_array79);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(i_array_array51);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow11 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array12 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[][] i_array_array13 = null;
        try {
            boolean b16 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array13, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(clearRow11);
        org.junit.Assert.assertNotNull(i_array_array12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = null;
        try {
            int[][] i_array_array13 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array10, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(clearRow23);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array39, i_array_array51, 0, 10);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array55, (int) '#', (int) '4');
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(clearRow59);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(clearRow47);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[][] i_array_array29 = new int[][] { i_array25, i_array28 };
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        com.quirko.logic.ClearRow clearRow31 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[] i_array37 = new int[] { (short) 1, (-1) };
        int[][] i_array_array38 = new int[][] { i_array34, i_array37 };
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array29, i_array_array38, (int) (byte) 10, 0);
        int[] i_array47 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array52 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array53 = new int[][] { i_array47, i_array52 };
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array53, (int) (byte) -1, (int) (byte) 1);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array63);
        boolean b68 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array65, 0, 10);
        int[][] i_array_array69 = com.quirko.logic.MatrixOperations.copy(i_array_array65);
        boolean b72 = com.quirko.logic.MatrixOperations.intersect(i_array_array22, i_array_array65, (int) 'a', (int) (short) 100);
        int[][] i_array_array73 = com.quirko.logic.MatrixOperations.copy(i_array_array65);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array65);
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array65);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(clearRow31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(i_array_array69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(i_array_array73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(clearRow75);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        boolean b23 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, (int) (byte) -1, 0);
        int[][] i_array_array24 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array27 = new int[] { (short) 1, (-1) };
        int[] i_array30 = new int[] { (short) 1, (-1) };
        int[][] i_array_array31 = new int[][] { i_array27, i_array30 };
        com.quirko.logic.ClearRow clearRow32 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array31);
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[] i_array38 = new int[] { (short) 1, (-1) };
        int[][] i_array_array39 = new int[][] { i_array35, i_array38 };
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        boolean b52 = com.quirko.logic.MatrixOperations.intersect(i_array_array39, i_array_array48, (int) (byte) 10, 0);
        int[] i_array57 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array63 = new int[][] { i_array57, i_array62 };
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array48, i_array_array63, (int) (byte) -1, (int) (byte) 1);
        int[] i_array69 = new int[] { (short) 1, (-1) };
        int[] i_array72 = new int[] { (short) 1, (-1) };
        int[][] i_array_array73 = new int[][] { i_array69, i_array72 };
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array73);
        int[][] i_array_array75 = com.quirko.logic.MatrixOperations.copy(i_array_array73);
        boolean b78 = com.quirko.logic.MatrixOperations.intersect(i_array_array63, i_array_array75, 0, 10);
        boolean b81 = com.quirko.logic.MatrixOperations.intersect(i_array_array31, i_array_array75, (int) (byte) -1, 1);
        try {
            int[][] i_array_array84 = com.quirko.logic.MatrixOperations.merge(i_array_array9, i_array_array31, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(clearRow32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array72);
        org.junit.Assert.assertNotNull(i_array_array73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow35 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertNotNull(clearRow35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertNotNull(clearRow41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array24 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array25 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(clearRow23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array17 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        int[][] i_array_array18 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array26, 0, (int) '#');
        int[][] i_array_array31 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        com.quirko.logic.ClearRow clearRow32 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        try {
            int[][] i_array_array35 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array26, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(clearRow32);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        boolean b23 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, (int) (byte) -1, 0);
        int[][] i_array_array24 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[][] i_array_array25 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        com.quirko.logic.ClearRow clearRow26 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array25);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(i_array_array25);
        org.junit.Assert.assertNotNull(clearRow26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array64, (int) (byte) 100, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        int[][] i_array_array81 = com.quirko.logic.MatrixOperations.copy(i_array_array80);
        try {
            int[][] i_array_array84 = com.quirko.logic.MatrixOperations.merge(i_array_array64, i_array_array81, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertNotNull(i_array_array81);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        boolean b21 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array17, 0, (int) '#');
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array17);
        com.quirko.logic.ClearRow clearRow23 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(i_array_array22);
        org.junit.Assert.assertNotNull(clearRow23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(clearRow25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        boolean b27 = com.quirko.logic.MatrixOperations.intersect(i_array_array14, i_array_array23, (int) (byte) 10, 0);
        int[] i_array32 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array37 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array38 = new int[][] { i_array32, i_array37 };
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array38, (int) (byte) -1, (int) (byte) 1);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array50, 0, 10);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array50, (int) (byte) -1, 1);
        com.quirko.logic.ClearRow clearRow57 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        int[][] i_array_array58 = com.quirko.logic.MatrixOperations.copy(i_array_array50);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array50);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(clearRow57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(clearRow59);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        boolean b60 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array53, (int) (short) -1, 0);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(clearRow61);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array36);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[] i_array54 = new int[] { (short) 1, (-1) };
        int[][] i_array_array55 = new int[][] { i_array51, i_array54 };
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array47, i_array_array55, 0, (int) '#');
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array37, i_array_array55, (int) (short) -1, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow65 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array37);
        com.quirko.logic.ClearRow clearRow66 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array37);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(clearRow65);
        org.junit.Assert.assertNotNull(clearRow66);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(clearRow37);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(i_array_array37);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array47);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[][] i_array_array59 = new int[][] { i_array55, i_array58 };
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        int[][] i_array_array63 = com.quirko.logic.MatrixOperations.copy(i_array_array59);
        try {
            int[][] i_array_array66 = com.quirko.logic.MatrixOperations.merge(i_array_array52, i_array_array59, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(i_array_array63);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow33 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array34 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow35 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array34);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(clearRow33);
        org.junit.Assert.assertNotNull(i_array_array34);
        org.junit.Assert.assertNotNull(clearRow35);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow11 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array12 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[][] i_array_array13 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow14 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array13);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(clearRow11);
        org.junit.Assert.assertNotNull(i_array_array12);
        org.junit.Assert.assertNotNull(i_array_array13);
        org.junit.Assert.assertNotNull(clearRow14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(clearRow21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array64, (int) (byte) 100, (int) (byte) 1);
        int[][] i_array_array71 = com.quirko.logic.MatrixOperations.copy(i_array_array64);
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(clearRow72);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(clearRow22);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array13);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array17);
        java.util.List<int[][]> list_i_array_array19 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
        org.junit.Assert.assertNotNull(list_i_array_array19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array47);
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[] i_array55 = new int[] { (short) 1, (-1) };
        int[] i_array58 = new int[] { (short) 1, (-1) };
        int[][] i_array_array59 = new int[][] { i_array55, i_array58 };
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array59);
        int[][] i_array_array61 = com.quirko.logic.MatrixOperations.copy(i_array_array59);
        try {
            int[][] i_array_array64 = com.quirko.logic.MatrixOperations.merge(i_array_array51, i_array_array61, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array55);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertNotNull(i_array_array61);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[][] i_array_array28 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[][] i_array_array35 = new int[][] { i_array31, i_array34 };
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        boolean b48 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array44, (int) (byte) 10, 0);
        boolean b51 = com.quirko.logic.MatrixOperations.intersect(i_array_array28, i_array_array35, 0, (int) (byte) 100);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array28);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        try {
            int[][] i_array_array57 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array52, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        int[] i_array41 = new int[] { (short) 1, (-1) };
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[][] i_array_array45 = new int[][] { i_array41, i_array44 };
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array45);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array45, i_array_array54, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array54);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        boolean b64 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array54, (int) (short) -1, 10);
        int[] i_array67 = new int[] { (short) 1, (-1) };
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[][] i_array_array71 = new int[][] { i_array67, i_array70 };
        com.quirko.logic.ClearRow clearRow72 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array71);
        int[][] i_array_array73 = com.quirko.logic.MatrixOperations.copy(i_array_array71);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array73);
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array73, (int) (short) -1, 100);
        int[][] i_array_array78 = null;
        try {
            boolean b81 = com.quirko.logic.MatrixOperations.intersect(i_array_array73, i_array_array78, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(i_array41);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(clearRow72);
        org.junit.Assert.assertNotNull(i_array_array73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertTrue(b77 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array10);
        int[][] i_array_array12 = null;
        try {
            int[][] i_array_array15 = com.quirko.logic.MatrixOperations.merge(i_array_array11, i_array_array12, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array_array11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array19 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array20 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array19);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
        org.junit.Assert.assertNotNull(list_i_array_array19);
        org.junit.Assert.assertNotNull(list_i_array_array20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        com.quirko.logic.ClearRow clearRow48 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertNotNull(clearRow48);
        org.junit.Assert.assertNotNull(i_array_array49);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        boolean b70 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array64, (int) (byte) 100, (int) (byte) 1);
        int[][] i_array_array71 = com.quirko.logic.MatrixOperations.copy(i_array_array64);
        int[][] i_array_array72 = com.quirko.logic.MatrixOperations.copy(i_array_array64);
        int[][] i_array_array73 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(i_array_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(i_array_array73);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[][] i_array_array14 = new int[][] { i_array10, i_array13 };
        com.quirko.logic.ClearRow clearRow15 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array14);
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[][] i_array_array23 = new int[][] { i_array19, i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        boolean b27 = com.quirko.logic.MatrixOperations.intersect(i_array_array14, i_array_array23, (int) (byte) 10, 0);
        int[] i_array32 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array37 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array38 = new int[][] { i_array32, i_array37 };
        boolean b41 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array38, (int) (byte) -1, (int) (byte) 1);
        int[] i_array44 = new int[] { (short) 1, (-1) };
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[][] i_array_array48 = new int[][] { i_array44, i_array47 };
        com.quirko.logic.ClearRow clearRow49 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array48);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array38, i_array_array50, 0, 10);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array50, (int) (byte) -1, 1);
        int[] i_array59 = new int[] { (short) 1, (-1) };
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[][] i_array_array63 = new int[][] { i_array59, i_array62 };
        com.quirko.logic.ClearRow clearRow64 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array63);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array63);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        com.quirko.logic.ClearRow clearRow74 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[] i_array80 = new int[] { (short) 1, (-1) };
        int[][] i_array_array81 = new int[][] { i_array77, i_array80 };
        com.quirko.logic.ClearRow clearRow82 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array81);
        boolean b85 = com.quirko.logic.MatrixOperations.intersect(i_array_array72, i_array_array81, (int) (byte) 10, 0);
        boolean b88 = com.quirko.logic.MatrixOperations.intersect(i_array_array65, i_array_array72, 0, (int) (byte) 100);
        int[][] i_array_array89 = com.quirko.logic.MatrixOperations.copy(i_array_array65);
        int[][] i_array_array90 = com.quirko.logic.MatrixOperations.copy(i_array_array65);
        com.quirko.logic.ClearRow clearRow91 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array90);
        try {
            int[][] i_array_array94 = com.quirko.logic.MatrixOperations.merge(i_array_array6, i_array_array90, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array_array14);
        org.junit.Assert.assertNotNull(clearRow15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(i_array44);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(clearRow49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array59);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertNotNull(clearRow64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(clearRow74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array_array81);
        org.junit.Assert.assertNotNull(clearRow82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(i_array_array89);
        org.junit.Assert.assertNotNull(i_array_array90);
        org.junit.Assert.assertNotNull(clearRow91);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[] i_array8 = new int[] { (short) 1, (-1) };
        int[][] i_array_array9 = new int[][] { i_array5, i_array8 };
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[] i_array17 = new int[] { (short) 1, (-1) };
        int[][] i_array_array18 = new int[][] { i_array14, i_array17 };
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array18, i_array_array27, (int) (byte) 10, 0);
        boolean b34 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array18, 0, (int) (byte) 100);
        boolean b37 = com.quirko.logic.MatrixOperations.intersect(i_array_array1, i_array_array18, (-1), 100);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array18);
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array18);
        int[] i_array42 = new int[] { (short) 1, (-1) };
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[][] i_array_array46 = new int[][] { i_array42, i_array45 };
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[][] i_array_array48 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array48);
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[] i_array56 = new int[] { (short) 1, (-1) };
        int[][] i_array_array57 = new int[][] { i_array53, i_array56 };
        com.quirko.logic.ClearRow clearRow58 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        boolean b61 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array57, 0, (int) '#');
        int[][] i_array_array62 = com.quirko.logic.MatrixOperations.copy(i_array_array57);
        int[][] i_array_array63 = com.quirko.logic.MatrixOperations.copy(i_array_array62);
        try {
            int[][] i_array_array66 = com.quirko.logic.MatrixOperations.merge(i_array_array18, i_array_array63, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(clearRow58);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertNotNull(i_array_array63);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array_array9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(clearRow37);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        boolean b31 = com.quirko.logic.MatrixOperations.intersect(i_array_array8, i_array_array15, 0, (int) (byte) 100);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        int[][] i_array_array55 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        com.quirko.logic.ClearRow clearRow56 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array55);
        int[][] i_array_array57 = com.quirko.logic.MatrixOperations.copy(i_array_array55);
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[] i_array63 = new int[] { (short) 1, (-1) };
        int[][] i_array_array64 = new int[][] { i_array60, i_array63 };
        com.quirko.logic.ClearRow clearRow65 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array64);
        int[][] i_array_array66 = com.quirko.logic.MatrixOperations.copy(i_array_array64);
        int[][] i_array_array67 = com.quirko.logic.MatrixOperations.copy(i_array_array66);
        com.quirko.logic.ClearRow clearRow68 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        com.quirko.logic.ClearRow clearRow69 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array67);
        boolean b72 = com.quirko.logic.MatrixOperations.intersect(i_array_array55, i_array_array67, (int) (byte) 10, (int) '#');
        try {
            boolean b75 = com.quirko.logic.MatrixOperations.intersect(i_array_array33, i_array_array55, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertNotNull(i_array_array55);
        org.junit.Assert.assertNotNull(clearRow56);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertNotNull(clearRow65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(i_array_array67);
        org.junit.Assert.assertNotNull(clearRow68);
        org.junit.Assert.assertNotNull(clearRow69);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array41, (int) (short) 10, (int) (byte) 0);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array41);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        int[][] i_array_array57 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        int[][] i_array_array58 = com.quirko.logic.MatrixOperations.copy(i_array_array53);
        com.quirko.logic.ClearRow clearRow59 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b62 = com.quirko.logic.MatrixOperations.intersect(i_array_array9, i_array_array53, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(i_array_array58);
        org.junit.Assert.assertNotNull(clearRow59);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array22 = new int[] {};
        int[][] i_array_array23 = new int[][] { i_array22 };
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        int[] i_array27 = new int[] { (short) 1, (-1) };
        int[] i_array30 = new int[] { (short) 1, (-1) };
        int[][] i_array_array31 = new int[][] { i_array27, i_array30 };
        com.quirko.logic.ClearRow clearRow32 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array31);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array31);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array33, i_array_array40, 0, (int) (byte) 100);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array23, i_array_array40, (-1), 100);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        try {
            int[][] i_array_array63 = com.quirko.logic.MatrixOperations.merge(i_array_array15, i_array_array40, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertNotNull(i_array30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(clearRow32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array_array60);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[] i_array28 = new int[] { (short) 1, (-1) };
        int[][] i_array_array29 = new int[][] { i_array25, i_array28 };
        com.quirko.logic.ClearRow clearRow30 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array29);
        int[][] i_array_array31 = com.quirko.logic.MatrixOperations.copy(i_array_array29);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array29);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        com.quirko.logic.ClearRow clearRow42 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[][] i_array_array49 = new int[][] { i_array45, i_array48 };
        com.quirko.logic.ClearRow clearRow50 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array49);
        boolean b53 = com.quirko.logic.MatrixOperations.intersect(i_array_array40, i_array_array49, (int) (byte) 10, 0);
        int[] i_array58 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array63 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array64 = new int[][] { i_array58, i_array63 };
        boolean b67 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array64, (int) (byte) -1, (int) (byte) 1);
        int[] i_array70 = new int[] { (short) 1, (-1) };
        int[] i_array73 = new int[] { (short) 1, (-1) };
        int[][] i_array_array74 = new int[][] { i_array70, i_array73 };
        com.quirko.logic.ClearRow clearRow75 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array74);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array74);
        boolean b79 = com.quirko.logic.MatrixOperations.intersect(i_array_array64, i_array_array76, 0, 10);
        boolean b82 = com.quirko.logic.MatrixOperations.intersect(i_array_array33, i_array_array76, (int) '#', 10);
        boolean b85 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array76, (int) (short) -1, (int) (short) -1);
        com.quirko.logic.ClearRow clearRow86 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertNotNull(i_array_array29);
        org.junit.Assert.assertNotNull(clearRow30);
        org.junit.Assert.assertNotNull(i_array_array31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(clearRow42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(clearRow50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(i_array58);
        org.junit.Assert.assertNotNull(i_array63);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(i_array70);
        org.junit.Assert.assertNotNull(i_array73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(clearRow75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(clearRow86);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        com.quirko.logic.ClearRow clearRow9 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        com.quirko.logic.ClearRow clearRow10 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array8);
        int[][] i_array_array11 = com.quirko.logic.MatrixOperations.copy(i_array_array8);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(clearRow9);
        org.junit.Assert.assertNotNull(clearRow10);
        org.junit.Assert.assertNotNull(i_array_array11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(clearRow46);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        int[][] i_array_array22 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(i_array_array22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array42);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array_array47);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int[] i_array0 = new int[] {};
        int[][] i_array_array1 = new int[][] { i_array0 };
        com.quirko.logic.ClearRow clearRow2 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        com.quirko.logic.ClearRow clearRow3 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        com.quirko.logic.ClearRow clearRow4 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array1);
        int[] i_array7 = new int[] { (short) 1, (-1) };
        int[] i_array10 = new int[] { (short) 1, (-1) };
        int[][] i_array_array11 = new int[][] { i_array7, i_array10 };
        com.quirko.logic.ClearRow clearRow12 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array11);
        com.quirko.logic.ClearRow clearRow13 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array11);
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[] i_array19 = new int[] { (short) 1, (-1) };
        int[][] i_array_array20 = new int[][] { i_array16, i_array19 };
        com.quirko.logic.ClearRow clearRow21 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array20);
        boolean b24 = com.quirko.logic.MatrixOperations.intersect(i_array_array11, i_array_array20, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array20);
        int[][] i_array_array26 = com.quirko.logic.MatrixOperations.copy(i_array_array20);
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        int[][] i_array_array28 = com.quirko.logic.MatrixOperations.copy(i_array_array26);
        int[] i_array31 = new int[] { (short) 1, (-1) };
        int[] i_array34 = new int[] { (short) 1, (-1) };
        int[][] i_array_array35 = new int[][] { i_array31, i_array34 };
        com.quirko.logic.ClearRow clearRow36 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[][] i_array_array37 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[][] i_array_array38 = com.quirko.logic.MatrixOperations.copy(i_array_array37);
        com.quirko.logic.ClearRow clearRow39 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        com.quirko.logic.ClearRow clearRow40 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array38);
        boolean b43 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array38, (int) (byte) 10, (int) '#');
        try {
            int[][] i_array_array46 = com.quirko.logic.MatrixOperations.merge(i_array_array1, i_array_array26, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertNotNull(i_array_array1);
        org.junit.Assert.assertNotNull(clearRow2);
        org.junit.Assert.assertNotNull(clearRow3);
        org.junit.Assert.assertNotNull(clearRow4);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertNotNull(i_array_array11);
        org.junit.Assert.assertNotNull(clearRow12);
        org.junit.Assert.assertNotNull(clearRow13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(clearRow21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertNotNull(i_array_array28);
        org.junit.Assert.assertNotNull(i_array31);
        org.junit.Assert.assertNotNull(i_array34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(clearRow36);
        org.junit.Assert.assertNotNull(i_array_array37);
        org.junit.Assert.assertNotNull(i_array_array38);
        org.junit.Assert.assertNotNull(clearRow39);
        org.junit.Assert.assertNotNull(clearRow40);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        int[][] i_array_array23 = com.quirko.logic.MatrixOperations.copy(i_array_array21);
        com.quirko.logic.ClearRow clearRow24 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array23);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(clearRow24);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array16);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array17);
        java.util.List<int[][]> list_i_array_array19 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array18);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
        org.junit.Assert.assertNotNull(list_i_array_array19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array48 = new int[] { (short) 1, (-1) };
        int[] i_array51 = new int[] { (short) 1, (-1) };
        int[][] i_array_array52 = new int[][] { i_array48, i_array51 };
        com.quirko.logic.ClearRow clearRow53 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array52);
        int[][] i_array_array54 = com.quirko.logic.MatrixOperations.copy(i_array_array52);
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[][] i_array_array61 = new int[][] { i_array57, i_array60 };
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        com.quirko.logic.ClearRow clearRow63 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[] i_array66 = new int[] { (short) 1, (-1) };
        int[] i_array69 = new int[] { (short) 1, (-1) };
        int[][] i_array_array70 = new int[][] { i_array66, i_array69 };
        com.quirko.logic.ClearRow clearRow71 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array70);
        boolean b74 = com.quirko.logic.MatrixOperations.intersect(i_array_array61, i_array_array70, (int) (byte) 10, 0);
        boolean b77 = com.quirko.logic.MatrixOperations.intersect(i_array_array54, i_array_array61, 0, (int) (byte) 100);
        boolean b80 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array61, (int) (short) 0, (int) (byte) 100);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array35, i_array_array61, 0, (int) (byte) 100);
        com.quirko.logic.ClearRow clearRow84 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[][] i_array_array85 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(i_array48);
        org.junit.Assert.assertNotNull(i_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
        org.junit.Assert.assertNotNull(clearRow53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(clearRow63);
        org.junit.Assert.assertNotNull(i_array66);
        org.junit.Assert.assertNotNull(i_array69);
        org.junit.Assert.assertNotNull(i_array_array70);
        org.junit.Assert.assertNotNull(clearRow71);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(clearRow84);
        org.junit.Assert.assertNotNull(i_array_array85);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        com.quirko.logic.ClearRow clearRow51 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array47);
        int[][] i_array_array52 = null;
        try {
            int[][] i_array_array55 = com.quirko.logic.MatrixOperations.merge(i_array_array47, i_array_array52, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(clearRow51);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array10 = com.quirko.logic.MatrixOperations.copy(i_array_array9);
        int[] i_array13 = new int[] { (short) 1, (-1) };
        int[] i_array16 = new int[] { (short) 1, (-1) };
        int[][] i_array_array17 = new int[][] { i_array13, i_array16 };
        com.quirko.logic.ClearRow clearRow18 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        com.quirko.logic.ClearRow clearRow19 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array17);
        int[] i_array22 = new int[] { (short) 1, (-1) };
        int[] i_array25 = new int[] { (short) 1, (-1) };
        int[][] i_array_array26 = new int[][] { i_array22, i_array25 };
        com.quirko.logic.ClearRow clearRow27 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array26);
        boolean b30 = com.quirko.logic.MatrixOperations.intersect(i_array_array17, i_array_array26, (int) (byte) 10, 0);
        int[] i_array35 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array40 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array41 = new int[][] { i_array35, i_array40 };
        boolean b44 = com.quirko.logic.MatrixOperations.intersect(i_array_array26, i_array_array41, (int) (byte) -1, (int) (byte) 1);
        int[] i_array47 = new int[] { (short) 1, (-1) };
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[][] i_array_array51 = new int[][] { i_array47, i_array50 };
        com.quirko.logic.ClearRow clearRow52 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array51);
        int[][] i_array_array53 = com.quirko.logic.MatrixOperations.copy(i_array_array51);
        boolean b56 = com.quirko.logic.MatrixOperations.intersect(i_array_array41, i_array_array53, 0, 10);
        boolean b59 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array41, (int) (short) 10, (int) (byte) 0);
        int[] i_array62 = new int[] { (short) 1, (-1) };
        int[] i_array65 = new int[] { (short) 1, (-1) };
        int[][] i_array_array66 = new int[][] { i_array62, i_array65 };
        com.quirko.logic.ClearRow clearRow67 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array66);
        int[][] i_array_array68 = com.quirko.logic.MatrixOperations.copy(i_array_array66);
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[][] i_array_array75 = new int[][] { i_array71, i_array74 };
        com.quirko.logic.ClearRow clearRow76 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        com.quirko.logic.ClearRow clearRow77 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array75);
        int[] i_array80 = new int[] { (short) 1, (-1) };
        int[] i_array83 = new int[] { (short) 1, (-1) };
        int[][] i_array_array84 = new int[][] { i_array80, i_array83 };
        com.quirko.logic.ClearRow clearRow85 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array84);
        boolean b88 = com.quirko.logic.MatrixOperations.intersect(i_array_array75, i_array_array84, (int) (byte) 10, 0);
        boolean b91 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array75, 0, (int) (byte) 100);
        int[][] i_array_array92 = com.quirko.logic.MatrixOperations.copy(i_array_array68);
        boolean b95 = com.quirko.logic.MatrixOperations.intersect(i_array_array10, i_array_array68, 1, (int) (short) 10);
        com.quirko.logic.ClearRow clearRow96 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array68);
        com.quirko.logic.ClearRow clearRow97 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array68);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array_array10);
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertNotNull(i_array16);
        org.junit.Assert.assertNotNull(i_array_array17);
        org.junit.Assert.assertNotNull(clearRow18);
        org.junit.Assert.assertNotNull(clearRow19);
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertNotNull(i_array_array26);
        org.junit.Assert.assertNotNull(clearRow27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array_array41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(i_array47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(clearRow52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array65);
        org.junit.Assert.assertNotNull(i_array_array66);
        org.junit.Assert.assertNotNull(clearRow67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertNotNull(clearRow76);
        org.junit.Assert.assertNotNull(clearRow77);
        org.junit.Assert.assertNotNull(i_array80);
        org.junit.Assert.assertNotNull(i_array83);
        org.junit.Assert.assertNotNull(i_array_array84);
        org.junit.Assert.assertNotNull(clearRow85);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(i_array_array92);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertNotNull(clearRow96);
        org.junit.Assert.assertNotNull(clearRow97);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array19 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
        org.junit.Assert.assertNotNull(list_i_array_array19);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        int[] i_array36 = new int[] { (short) 1, (-1) };
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[][] i_array_array40 = new int[][] { i_array36, i_array39 };
        com.quirko.logic.ClearRow clearRow41 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array40);
        int[][] i_array_array42 = com.quirko.logic.MatrixOperations.copy(i_array_array40);
        boolean b45 = com.quirko.logic.MatrixOperations.intersect(i_array_array30, i_array_array42, 0, 10);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array42);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[][] i_array_array48 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(i_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array_array40);
        org.junit.Assert.assertNotNull(clearRow41);
        org.junit.Assert.assertNotNull(i_array_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array_array48);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        int[] i_array39 = new int[] { (short) 1, (-1) };
        int[] i_array42 = new int[] { (short) 1, (-1) };
        int[][] i_array_array43 = new int[][] { i_array39, i_array42 };
        com.quirko.logic.ClearRow clearRow44 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array43);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array43);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[] i_array50 = new int[] { (short) 1, (-1) };
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[][] i_array_array54 = new int[][] { i_array50, i_array53 };
        com.quirko.logic.ClearRow clearRow55 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        boolean b58 = com.quirko.logic.MatrixOperations.intersect(i_array_array46, i_array_array54, 0, (int) '#');
        int[][] i_array_array59 = com.quirko.logic.MatrixOperations.copy(i_array_array54);
        com.quirko.logic.ClearRow clearRow60 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        com.quirko.logic.ClearRow clearRow61 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array54);
        int[][] i_array_array62 = com.quirko.logic.MatrixOperations.copy(i_array_array54);
        boolean b65 = com.quirko.logic.MatrixOperations.intersect(i_array_array36, i_array_array54, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(i_array39);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array_array43);
        org.junit.Assert.assertNotNull(clearRow44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array_array54);
        org.junit.Assert.assertNotNull(clearRow55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(clearRow60);
        org.junit.Assert.assertNotNull(clearRow61);
        org.junit.Assert.assertNotNull(i_array_array62);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        com.quirko.logic.ClearRow clearRow20 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[][] i_array_array21 = com.quirko.logic.MatrixOperations.copy(i_array_array15);
        com.quirko.logic.ClearRow clearRow22 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array21);
        int[][] i_array_array23 = com.quirko.logic.MatrixOperations.copy(i_array_array21);
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[] i_array29 = new int[] { (short) 1, (-1) };
        int[][] i_array_array30 = new int[][] { i_array26, i_array29 };
        com.quirko.logic.ClearRow clearRow31 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array32 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array33 = com.quirko.logic.MatrixOperations.copy(i_array_array32);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array33);
        com.quirko.logic.ClearRow clearRow35 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array33);
        boolean b38 = com.quirko.logic.MatrixOperations.intersect(i_array_array21, i_array_array33, (int) (byte) 10, (int) '#');
        int[][] i_array_array39 = com.quirko.logic.MatrixOperations.copy(i_array_array21);
        int[] i_array42 = new int[] { (short) 1, (-1) };
        int[] i_array45 = new int[] { (short) 1, (-1) };
        int[][] i_array_array46 = new int[][] { i_array42, i_array45 };
        com.quirko.logic.ClearRow clearRow47 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array46);
        int[][] i_array_array48 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        int[][] i_array_array49 = com.quirko.logic.MatrixOperations.copy(i_array_array46);
        int[][] i_array_array50 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        int[] i_array53 = new int[] { (short) 1, (-1) };
        int[] i_array56 = new int[] { (short) 1, (-1) };
        int[][] i_array_array57 = new int[][] { i_array53, i_array56 };
        com.quirko.logic.ClearRow clearRow58 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array57);
        int[][] i_array_array59 = com.quirko.logic.MatrixOperations.copy(i_array_array57);
        int[][] i_array_array60 = com.quirko.logic.MatrixOperations.copy(i_array_array57);
        boolean b63 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array57, (int) (byte) -1, 0);
        int[][] i_array_array64 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        int[][] i_array_array65 = com.quirko.logic.MatrixOperations.copy(i_array_array49);
        int[] i_array68 = new int[] { (short) 1, (-1) };
        int[] i_array71 = new int[] { (short) 1, (-1) };
        int[][] i_array_array72 = new int[][] { i_array68, i_array71 };
        com.quirko.logic.ClearRow clearRow73 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array72);
        int[][] i_array_array74 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        int[][] i_array_array75 = com.quirko.logic.MatrixOperations.copy(i_array_array72);
        int[][] i_array_array76 = com.quirko.logic.MatrixOperations.copy(i_array_array75);
        int[] i_array79 = new int[] { (short) 1, (-1) };
        int[] i_array82 = new int[] { (short) 1, (-1) };
        int[][] i_array_array83 = new int[][] { i_array79, i_array82 };
        com.quirko.logic.ClearRow clearRow84 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array83);
        int[][] i_array_array85 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.copy(i_array_array83);
        boolean b89 = com.quirko.logic.MatrixOperations.intersect(i_array_array75, i_array_array83, (int) (byte) -1, 0);
        boolean b92 = com.quirko.logic.MatrixOperations.intersect(i_array_array49, i_array_array83, (int) (byte) 1, (int) (short) 10);
        boolean b95 = com.quirko.logic.MatrixOperations.intersect(i_array_array21, i_array_array83, 0, 0);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(clearRow20);
        org.junit.Assert.assertNotNull(i_array_array21);
        org.junit.Assert.assertNotNull(clearRow22);
        org.junit.Assert.assertNotNull(i_array_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertNotNull(clearRow31);
        org.junit.Assert.assertNotNull(i_array_array32);
        org.junit.Assert.assertNotNull(i_array_array33);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(clearRow35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(clearRow47);
        org.junit.Assert.assertNotNull(i_array_array48);
        org.junit.Assert.assertNotNull(i_array_array49);
        org.junit.Assert.assertNotNull(i_array_array50);
        org.junit.Assert.assertNotNull(i_array53);
        org.junit.Assert.assertNotNull(i_array56);
        org.junit.Assert.assertNotNull(i_array_array57);
        org.junit.Assert.assertNotNull(clearRow58);
        org.junit.Assert.assertNotNull(i_array_array59);
        org.junit.Assert.assertNotNull(i_array_array60);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(i_array_array64);
        org.junit.Assert.assertNotNull(i_array_array65);
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertNotNull(i_array71);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(clearRow73);
        org.junit.Assert.assertNotNull(i_array_array74);
        org.junit.Assert.assertNotNull(i_array_array75);
        org.junit.Assert.assertNotNull(i_array_array76);
        org.junit.Assert.assertNotNull(i_array79);
        org.junit.Assert.assertNotNull(i_array82);
        org.junit.Assert.assertNotNull(i_array_array83);
        org.junit.Assert.assertNotNull(clearRow84);
        org.junit.Assert.assertNotNull(i_array_array85);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b95 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        int[] i_array20 = new int[] { (short) 1, (-1) };
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[][] i_array_array24 = new int[][] { i_array20, i_array23 };
        com.quirko.logic.ClearRow clearRow25 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array24);
        boolean b28 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array24, (int) (byte) 10, 0);
        int[] i_array33 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array38 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array39 = new int[][] { i_array33, i_array38 };
        boolean b42 = com.quirko.logic.MatrixOperations.intersect(i_array_array24, i_array_array39, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow43 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array39);
        int[][] i_array_array44 = com.quirko.logic.MatrixOperations.copy(i_array_array39);
        int[][] i_array_array45 = com.quirko.logic.MatrixOperations.copy(i_array_array44);
        int[][] i_array_array46 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        int[][] i_array_array47 = com.quirko.logic.MatrixOperations.copy(i_array_array45);
        boolean b50 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array47, (int) (byte) 1, (int) '4');
        int[][] i_array_array51 = com.quirko.logic.MatrixOperations.copy(i_array_array47);
        int[][] i_array_array52 = com.quirko.logic.MatrixOperations.copy(i_array_array47);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array_array24);
        org.junit.Assert.assertNotNull(clearRow25);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(i_array33);
        org.junit.Assert.assertNotNull(i_array38);
        org.junit.Assert.assertNotNull(i_array_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(clearRow43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(i_array_array45);
        org.junit.Assert.assertNotNull(i_array_array46);
        org.junit.Assert.assertNotNull(i_array_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertNotNull(i_array_array52);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        com.quirko.logic.ClearRow clearRow8 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[] i_array11 = new int[] { (short) 1, (-1) };
        int[] i_array14 = new int[] { (short) 1, (-1) };
        int[][] i_array_array15 = new int[][] { i_array11, i_array14 };
        com.quirko.logic.ClearRow clearRow16 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array15);
        boolean b19 = com.quirko.logic.MatrixOperations.intersect(i_array_array6, i_array_array15, (int) (byte) 10, 0);
        int[] i_array24 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array29 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array30 = new int[][] { i_array24, i_array29 };
        boolean b33 = com.quirko.logic.MatrixOperations.intersect(i_array_array15, i_array_array30, (int) (byte) -1, (int) (byte) 1);
        com.quirko.logic.ClearRow clearRow34 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array30);
        int[][] i_array_array35 = com.quirko.logic.MatrixOperations.copy(i_array_array30);
        int[][] i_array_array36 = com.quirko.logic.MatrixOperations.copy(i_array_array35);
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array35);
        int[] i_array40 = new int[] { (short) 1, (-1) };
        int[] i_array43 = new int[] { (short) 1, (-1) };
        int[][] i_array_array44 = new int[][] { i_array40, i_array43 };
        com.quirko.logic.ClearRow clearRow45 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        com.quirko.logic.ClearRow clearRow46 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array44);
        int[] i_array49 = new int[] { (short) 1, (-1) };
        int[] i_array52 = new int[] { (short) 1, (-1) };
        int[][] i_array_array53 = new int[][] { i_array49, i_array52 };
        com.quirko.logic.ClearRow clearRow54 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array53);
        boolean b57 = com.quirko.logic.MatrixOperations.intersect(i_array_array44, i_array_array53, (int) (byte) 10, 0);
        int[] i_array62 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array67 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array68 = new int[][] { i_array62, i_array67 };
        boolean b71 = com.quirko.logic.MatrixOperations.intersect(i_array_array53, i_array_array68, (int) (byte) -1, (int) (byte) 1);
        int[] i_array74 = new int[] { (short) 1, (-1) };
        int[] i_array77 = new int[] { (short) 1, (-1) };
        int[][] i_array_array78 = new int[][] { i_array74, i_array77 };
        com.quirko.logic.ClearRow clearRow79 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array78);
        int[][] i_array_array80 = com.quirko.logic.MatrixOperations.copy(i_array_array78);
        boolean b83 = com.quirko.logic.MatrixOperations.intersect(i_array_array68, i_array_array80, 0, 10);
        int[][] i_array_array86 = com.quirko.logic.MatrixOperations.merge(i_array_array35, i_array_array80, (int) (short) 1, 0);
        int[][] i_array_array87 = com.quirko.logic.MatrixOperations.copy(i_array_array80);
        int[][] i_array_array88 = null;
        try {
            boolean b91 = com.quirko.logic.MatrixOperations.intersect(i_array_array87, i_array_array88, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(clearRow8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertNotNull(i_array14);
        org.junit.Assert.assertNotNull(i_array_array15);
        org.junit.Assert.assertNotNull(clearRow16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertNotNull(i_array29);
        org.junit.Assert.assertNotNull(i_array_array30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(clearRow34);
        org.junit.Assert.assertNotNull(i_array_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertNotNull(i_array40);
        org.junit.Assert.assertNotNull(i_array43);
        org.junit.Assert.assertNotNull(i_array_array44);
        org.junit.Assert.assertNotNull(clearRow45);
        org.junit.Assert.assertNotNull(clearRow46);
        org.junit.Assert.assertNotNull(i_array49);
        org.junit.Assert.assertNotNull(i_array52);
        org.junit.Assert.assertNotNull(i_array_array53);
        org.junit.Assert.assertNotNull(clearRow54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(i_array62);
        org.junit.Assert.assertNotNull(i_array67);
        org.junit.Assert.assertNotNull(i_array_array68);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(i_array74);
        org.junit.Assert.assertNotNull(i_array77);
        org.junit.Assert.assertNotNull(i_array_array78);
        org.junit.Assert.assertNotNull(clearRow79);
        org.junit.Assert.assertNotNull(i_array_array80);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(i_array_array86);
        org.junit.Assert.assertNotNull(i_array_array87);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][][] i_array_array_array8 = new int[][][] { i_array_array6 };
        java.util.ArrayList<int[][]> arraylist_i_array_array9 = new java.util.ArrayList<int[][]>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<int[][]>) arraylist_i_array_array9, i_array_array_array8);
        java.util.List<int[][]> list_i_array_array11 = com.quirko.logic.MatrixOperations.deepCopyList((java.util.List<int[][]>) arraylist_i_array_array9);
        java.util.List<int[][]> list_i_array_array12 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array11);
        java.util.List<int[][]> list_i_array_array13 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array14 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array12);
        java.util.List<int[][]> list_i_array_array15 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array16 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array17 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array14);
        java.util.List<int[][]> list_i_array_array18 = com.quirko.logic.MatrixOperations.deepCopyList(list_i_array_array17);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(list_i_array_array11);
        org.junit.Assert.assertNotNull(list_i_array_array12);
        org.junit.Assert.assertNotNull(list_i_array_array13);
        org.junit.Assert.assertNotNull(list_i_array_array14);
        org.junit.Assert.assertNotNull(list_i_array_array15);
        org.junit.Assert.assertNotNull(list_i_array_array16);
        org.junit.Assert.assertNotNull(list_i_array_array17);
        org.junit.Assert.assertNotNull(list_i_array_array18);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int[] i_array2 = new int[] { (short) 1, (-1) };
        int[] i_array5 = new int[] { (short) 1, (-1) };
        int[][] i_array_array6 = new int[][] { i_array2, i_array5 };
        com.quirko.logic.ClearRow clearRow7 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array6);
        int[][] i_array_array8 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[][] i_array_array9 = com.quirko.logic.MatrixOperations.copy(i_array_array6);
        int[] i_array12 = new int[] { (short) 1, (-1) };
        int[] i_array15 = new int[] { (short) 1, (-1) };
        int[][] i_array_array16 = new int[][] { i_array12, i_array15 };
        com.quirko.logic.ClearRow clearRow17 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array16);
        int[][] i_array_array18 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        int[][] i_array_array19 = com.quirko.logic.MatrixOperations.copy(i_array_array16);
        int[][] i_array_array20 = com.quirko.logic.MatrixOperations.copy(i_array_array19);
        int[] i_array23 = new int[] { (short) 1, (-1) };
        int[] i_array26 = new int[] { (short) 1, (-1) };
        int[][] i_array_array27 = new int[][] { i_array23, i_array26 };
        com.quirko.logic.ClearRow clearRow28 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        com.quirko.logic.ClearRow clearRow29 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array27);
        int[] i_array32 = new int[] { (short) 1, (-1) };
        int[] i_array35 = new int[] { (short) 1, (-1) };
        int[][] i_array_array36 = new int[][] { i_array32, i_array35 };
        com.quirko.logic.ClearRow clearRow37 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array36);
        boolean b40 = com.quirko.logic.MatrixOperations.intersect(i_array_array27, i_array_array36, (int) (byte) 10, 0);
        int[] i_array45 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[] i_array50 = new int[] { (byte) 100, ' ', (byte) 100, '4' };
        int[][] i_array_array51 = new int[][] { i_array45, i_array50 };
        boolean b54 = com.quirko.logic.MatrixOperations.intersect(i_array_array36, i_array_array51, (int) (byte) -1, (int) (byte) 1);
        int[] i_array57 = new int[] { (short) 1, (-1) };
        int[] i_array60 = new int[] { (short) 1, (-1) };
        int[][] i_array_array61 = new int[][] { i_array57, i_array60 };
        com.quirko.logic.ClearRow clearRow62 = com.quirko.logic.MatrixOperations.checkRemoving(i_array_array61);
        int[][] i_array_array63 = com.quirko.logic.MatrixOperations.copy(i_array_array61);
        boolean b66 = com.quirko.logic.MatrixOperations.intersect(i_array_array51, i_array_array63, 0, 10);
        boolean b69 = com.quirko.logic.MatrixOperations.intersect(i_array_array20, i_array_array51, (int) (short) 10, (int) (byte) 0);
        int[][] i_array_array72 = com.quirko.logic.MatrixOperations.merge(i_array_array9, i_array_array20, 0, (int) (short) 0);
        int[][] i_array_array73 = com.quirko.logic.MatrixOperations.copy(i_array_array20);
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertNotNull(i_array_array6);
        org.junit.Assert.assertNotNull(clearRow7);
        org.junit.Assert.assertNotNull(i_array_array8);
        org.junit.Assert.assertNotNull(i_array_array9);
        org.junit.Assert.assertNotNull(i_array12);
        org.junit.Assert.assertNotNull(i_array15);
        org.junit.Assert.assertNotNull(i_array_array16);
        org.junit.Assert.assertNotNull(clearRow17);
        org.junit.Assert.assertNotNull(i_array_array18);
        org.junit.Assert.assertNotNull(i_array_array19);
        org.junit.Assert.assertNotNull(i_array_array20);
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertNotNull(i_array_array27);
        org.junit.Assert.assertNotNull(clearRow28);
        org.junit.Assert.assertNotNull(clearRow29);
        org.junit.Assert.assertNotNull(i_array32);
        org.junit.Assert.assertNotNull(i_array35);
        org.junit.Assert.assertNotNull(i_array_array36);
        org.junit.Assert.assertNotNull(clearRow37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(i_array45);
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertNotNull(i_array_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(i_array57);
        org.junit.Assert.assertNotNull(i_array60);
        org.junit.Assert.assertNotNull(i_array_array61);
        org.junit.Assert.assertNotNull(clearRow62);
        org.junit.Assert.assertNotNull(i_array_array63);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(i_array_array72);
        org.junit.Assert.assertNotNull(i_array_array73);
    }
}

