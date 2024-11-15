package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Vector2fTest {
    @Test
    public void testAddition() {
        Vector2f v1 = new Vector2f(1, 2);
        Vector2f v2 = new Vector2f(3, 4);
        Vector2f result = v1.add(v2);
        assertEquals(new Vector2f(4, 6), result);
    }

    @Test
    public void testSubtraction() {
        Vector2f v1 = new Vector2f(1, 2);
        Vector2f v2 = new Vector2f(3, 4);
        Vector2f result = v1.subtract(v2);
        assertEquals(new Vector2f(-2, -2), result);
    }

    @Test
    public void testMultiplication() {
        Vector2f v1 = new Vector2f(1, 2);
        float s1 = 0.5f;
        Vector2f result = v1.multiplyByScalar(s1);
        assertEquals(new Vector2f(0.5f, 1), result);
    }

    @Test
    public void testDivision() {
        Vector2f v1 = new Vector2f(1, 2);
        float s1 = 2;
        Vector2f result = v1.divideByScalar(s1);
        assertEquals(new Vector2f(0.5f, 1), result);
    }

    @Test
    public void testDivision_Zero() {
        Vector2f v1 = new Vector2f(1, 2);
        float s1 = 0;
        assertThrows(ArithmeticException.class, () -> v1.divideByScalar(s1));
    }

    @Test
    public void testGettingLength() {
        Vector2f v1 = new Vector2f(3, 4);
        float result = v1.getLength();
        assertEquals(5f, result);
    }

    @Test
    public void testNormalization() {
        Vector2f v1 = new Vector2f(3, 4);
        Vector2f result = v1.normalize();
        assertEquals(new Vector2f(0.6f, 0.8f), result);
    }

    @Test
    public void testNormalization_Zero() {
        Vector2f v1 = new Vector2f(0, 0);
        assertThrows(ArithmeticException.class, v1::normalize);
    }

    @Test
    public void testScalarProduction() {
        Vector2f v1 = new Vector2f(1, 2);
        Vector2f v2 = new Vector2f(3, 4);
        float result = v1.scalarProduct(v2);
        assertEquals(11f, result);
    }
}