package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector4fTest {
    @Test
    public void testAddition() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        Vector4f v2 = new Vector4f(5, 6, 7, 8);
        Vector4f result = v1.add(v2);
        assertEquals(new Vector4f(6, 8, 10, 12), result);
    }

    @Test
    public void testSubtraction() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        Vector4f v2 = new Vector4f(5, 6, 7, 8);
        Vector4f result = v1.subtract(v2);
        assertEquals(new Vector4f(-4, -4, -4, -4), result);
    }

    @Test
    public void testMultiplication() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        float s1 = 0.5f;
        Vector4f result = v1.multiplyByScalar(s1);
        assertEquals(new Vector4f(0.5f, 1, 1.5f, 2), result);
    }

    @Test
    public void testDivision() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        float s1 = 2;
        Vector4f result = v1.divideByScalar(s1);
        assertEquals(new Vector4f(0.5f, 1, 1.5f, 2), result);
    }

    @Test
    public void testDivision_Zero() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        float s1 = 0;
        assertThrows(ArithmeticException.class, () -> v1.divideByScalar(s1));
    }

    @Test
    public void testGettingLength() {
        Vector4f v1 = new Vector4f(1, 2, 2, 3);
        float result = v1.getLength();
        assertEquals((float) (3 * Math.sqrt(2)), result);
    }

    @Test
    public void testNormalization() {
        Vector4f v1 = new Vector4f(1, 2, 2, 3);
        Vector4f result = v1.normalize();
        assertEquals(new Vector4f((float) (1 / (3 * Math.sqrt(2))), (float) (2 / (3 * Math.sqrt(2))), (float) (2 / (3 * Math.sqrt(2))), (float) (1 / Math.sqrt(2))), result);
    }

    @Test
    public void testNormalization_Zero() {
        Vector4f v1 = new Vector4f(0, 0, 0, 0);
        assertThrows(ArithmeticException.class, v1::normalize);
    }

    @Test
    public void testScalarProduction() {
        Vector4f v1 = new Vector4f(1, 2, 3, 4);
        Vector4f v2 = new Vector4f(5, 6, 7, 8);
        float result = v1.scalarProduct(v2);
        assertEquals(70f, result);
    }
}