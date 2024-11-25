package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import org.junit.jupiter.api.Test;
import ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix4f;

import static junit.framework.Assert.assertEquals;
import static ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix4f.unitMatrix4f;

public class Matrix4fTest {
    @Test
    public void testAddition() {
        Matrix4f m1 = new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16));
        Matrix4f m2 = unitMatrix4f();
        Matrix4f result = m1.add(m2);
        assertEquals(new Matrix4f(new Vector4f(2, 2, 3, 4), new Vector4f(5, 7, 7, 8), new Vector4f(9, 10, 12, 12), new Vector4f(13, 14, 15, 17)), result);
    }

    @Test
    public void testSubtraction() {
        Matrix4f m1 = new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16));
        Matrix4f m2 = unitMatrix4f();
        Matrix4f result = m1.subtract(m2);
        assertEquals(new Matrix4f(new Vector4f(0, 2, 3, 4), new Vector4f(5, 5, 7, 8), new Vector4f(9, 10, 10, 12), new Vector4f(13, 14, 15, 15)), result);
    }

    @Test
    public void testMultiplicationByVector() {
        Matrix4f m1 = new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16));
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        Vector4f result = m1.multiplyByVector(v1);
        assertEquals(new Vector4f(30, 70, 110, 150), result);
    }

    @Test
    public void testMultiplicationByMatrix() {
        Matrix4f m1 = new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16));
        Matrix4f m2 = unitMatrix4f();
        Matrix4f result = m1.multiplyByMatrix(m2);
        assertEquals(new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16)), result);
    }

    @Test
    public void testTransposition() {
        Matrix4f m1 = new Matrix4f(new Vector4f(1, 2, 3, 4), new Vector4f(5, 6, 7, 8), new Vector4f(9, 10, 11, 12), new Vector4f(13, 14, 15, 16));
        Matrix4f result = m1.transpose();
        assertEquals(new Matrix4f(new Vector4f(1, 5, 9, 13), new Vector4f(2, 6, 10, 14), new Vector4f(3, 7, 11, 15), new Vector4f(4, 8, 12, 16)), result);
    }
}
