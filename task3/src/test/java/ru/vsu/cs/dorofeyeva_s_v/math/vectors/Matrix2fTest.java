package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix2f;
import ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix3f;

import static junit.framework.Assert.assertEquals;

public class Matrix2fTest {
    @Test
    public void testAddition() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        Matrix2f m2 = new Matrix2f(new Vector2f(5, 6), new Vector2f(7, 8));
        Matrix2f result = m1.add(m2);
        assertEquals(new Matrix2f(new Vector2f(6, 8), new Vector2f(10, 12)), result);
    }

    @Test
    public void testSubtraction() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        Matrix2f m2 = new Matrix2f(new Vector2f(5, 6), new Vector2f(7, 8));
        Matrix2f result = m1.subtract(m2);
        assertEquals(new Matrix2f(new Vector2f(-4, -4), new Vector2f(-4, -4)), result);
    }

    @Test
    public void testMultiplicationByVector() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        Vector2f v1 = new Vector2f(9, 10);
        Vector2f result = m1.multiplyByVector(v1);
        assertEquals(new Vector2f(29, 67), result);
    }

    @Test
    public void testMultiplicationByMatrix() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        Matrix2f m2 = new Matrix2f(new Vector2f(5, 6), new Vector2f(7, 8));
        Matrix2f result = m1.multiplyByMatrix(m2);
        assertEquals(new Matrix2f(new Vector2f(19, 22), new Vector2f(43, 50)), result);
    }

    @Test
    public void testTransposition() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        Matrix2f result = m1.transpose();
        assertEquals(new Matrix2f(new Vector2f(1, 3), new Vector2f(2, 4)), result);
    }

    @Test
    public void testDeterminant() {
        Matrix2f m1 = new Matrix2f(new Vector2f(1, 2), new Vector2f(3, 4));
        float result = m1.determinant();
        assertEquals(-2f, result);
    }
}

