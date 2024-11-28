package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix3f;

import static junit.framework.Assert.assertEquals;

public class Matrix3fTest {
    @Test
    public void testAddition() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Matrix3f m2 = new Matrix3f(new float[]{10, 11, 12, 13, 14, 15, 16, 17, 18});
        Matrix3f result = m1.add(m2);
        assertEquals(new Matrix3f(new float[]{11, 13, 15, 17, 19, 21, 23, 25, 27}), result);
    }

    @Test
    public void testSubtraction() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Matrix3f m2 = new Matrix3f(new float[]{10, 11, 12, 13, 14, 15, 16, 17, 18});
        Matrix3f result = m1.subtract(m2);
        assertEquals(new Matrix3f(new float[]{-9, -9, -9, -9, -9, -9, -9, -9, -9}), result);
    }

    @Test
    public void testMultiplicationByVector() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Vector3f v1 = new Vector3f(10, 11, 12);
        Vector3f result = m1.multiplyByVector(v1);
        assertEquals(new Vector3f(68, 167,266), result);
    }

    @Test
    public void testMultiplicationByMatrix() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Matrix3f m2 = new Matrix3f(new float[]{10, 11, 12, 13, 14, 15, 16, 17, 18});
        Matrix3f result = m1.multiplyByMatrix(m2);
        assertEquals(new Matrix3f(new float[]{84, 90, 96, 201, 216, 231, 318, 342, 366}), result);
    }

    @Test
    public void testTransposition() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Matrix3f result = m1.transpose();
        assertEquals(new Matrix3f(new float[]{1, 4, 7, 2, 5, 8, 3, 6, 9}), result);
    }

    @Test
    public void testDeterminant() {
        Matrix3f m1 = new Matrix3f(new float[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        float result = m1.determinant();
        assertEquals(0f, result);
    }
}

