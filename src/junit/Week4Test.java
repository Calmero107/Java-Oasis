package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {

    /**
     * Kiểm thử phương thức max2Int.
     */
    @Test
    public void testMax2Int1() {
        Week4 week4 = new Week4();
        assertEquals(3, week4.max2Int(2, 3));
    }

    /**
     * Kiểm thử phương thức max2Int.
     */
    @Test
    public void testMax2Int2() {
        Week4 week4 = new Week4();
        assertEquals(5, week4.max2Int(2, 5));
    }

    /**
     * Kiểm thử phương thức max2Int.
     */
    @Test
    public void testMax2Int3() {
        Week4 week4 = new Week4();
        assertEquals(7, week4.max2Int(2, 7));
    }

    /**
     * Kiểm thử phương thức max2Int.
     */
    @Test
    public void testMax2Int4() {
        Week4 week4 = new Week4();
        assertEquals(3, week4.max2Int(1, 3));
    }

    /**
     * Kiểm thử phương thức max2Int.
     */
    @Test
    public void testMax2Int5() {
        Week4 week4 = new Week4();
        assertEquals(3, week4.max2Int(-1, 3));
    }

    /**
     * Kiểm thử phương thức minArray.
     */
    @Test
    public void testMinArray1() {
        Week4 week4 = new Week4();
        int[] array = {1, 2, 3, 4};
        assertEquals(1, week4.minArray(array));
    }

    /**
     * Kiểm thử phương thức minArray.
     */
    @Test
    public void testMinArray2() {
        Week4 week4 = new Week4();
        int[] array = {1, 2, 6, 8, 4};
        assertEquals(1, week4.minArray(array));
    }

    /**
     * Kiểm thử phương thức minArray.
     */
    @Test
    public void testMinArray3() {
        Week4 week4 = new Week4();
        int[] array = {9, 8, -6, 1, 2, 3, 4};
        assertEquals(-6, week4.minArray(array));
    }

    /**
     * Kiểm thử phương thức minArray.
     */
    @Test
    public void testMinArray4() {
        Week4 week4 = new Week4();
        int[] array = {9, 8, 7, 1, 2, 3, 4};
        assertEquals(1, week4.minArray(array));
    }

    /**
     * Kiểm thử phương thức minArray.
     */
    @Test
    public void testMinArray5() {
        Week4 week4 = new Week4();
        int[] array = {1, 2, 3, -4};
        assertEquals(-4, week4.minArray(array));
    }

    /**
     * Kiểm thử phương thức calculateBMI với người thiếu cân.
     */
    @Test
    public void testCalculateBMI1() {
        Week4 week4 = new Week4();
        assertEquals("Thiếu cân", week4.calculateBMI(45, 1.7));
    }

    /**
     * Kiểm thử phương thức calculateBMI với người bình thường.
     */
    @Test
    public void testCalculateBMI2() {
        Week4 week4 = new Week4();
        assertEquals("Bình thường", week4.calculateBMI(45, 1.55));
    }

    /**
     * Kiểm thử phương thức calculateBMI với người thừa cân.
     */
    @Test
    public void testCalculateBMI3() {
        Week4 week4 = new Week4();
        assertEquals("Thừa cân", week4.calculateBMI(45, 1.37));
    }

    /**
     * Kiểm thử phương thức calculateBMI với người béo phì.
     */
    @Test
    public void testCalculateBMI4() {
        Week4 week4 = new Week4();
        assertEquals("Béo phì", week4.calculateBMI(70, 1.5));
    }

    /**
     * Kiểm thử phương thức calculateBMI với người thiếu cân khác.
     */
    @Test
    public void testCalculateBMI5() {
        Week4 week4 = new Week4();
        assertEquals("Thiếu cân", week4.calculateBMI(45, 1.8));
    }
}