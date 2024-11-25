package ru.vsu.cs.dorofeyeva_s_v.math.vectors;

import lombok.Getter;
import lombok.Setter;
import ru.vsu.cs.dorofeyeva_s_v.math.matrices.Matrix2f;

@Getter
@Setter
public class Vector3f {
    private float x;
    private float y;
    private float z;
    private final float EPS = 1e-7f;

    public Vector3f() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Vector3f vector3f = (Vector3f) o;
        return Math.abs(this.x - vector3f.getX()) < EPS
                && Math.abs(this.y - vector3f.getY()) < EPS
                && Math.abs(this.z - vector3f.getZ()) < EPS;
    }

    public Vector3f add(Vector3f vector3f) {
        this.x += vector3f.getX();
        this.y += vector3f.getY();
        this.z += vector3f.getZ();
        return this;
    }

    public Vector3f subtract(Vector3f vector3f) {
        this.x -= vector3f.getX();
        this.y -= vector3f.getY();
        this.z -= vector3f.getZ();
        return this;
    }

    public Vector3f multiplyByScalar(float scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
        return this;
    }

    public Vector3f divideByScalar(float scalar) throws ArithmeticException {
        if (Math.abs(scalar) < EPS) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        this.x /= scalar;
        this.y /= scalar;
        this.z /= scalar;
        return this;
    }

    public float getLength() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public Vector3f normalize() throws ArithmeticException {
        float length = getLength();
        if (Math.abs(length) < EPS) {
            throw new ArithmeticException("Cannot normalize a vector with zero length.");
        }
        return this.divideByScalar(length);
    }

    public float scalarProduct(Vector3f vector3f) {
        return this.x * vector3f.getX() + this.y * vector3f.getY() + this.z * vector3f.getZ();
    }

    public Vector3f vectorProduct(Vector3f vector3f) {
        Vector3f i = new Vector3f(1, 0, 0);
        Vector3f j = new Vector3f(0, 1, 0);
        Vector3f k = new Vector3f(0, 0, 1);
        Matrix2f m1 = new Matrix2f(new Vector2f(this.y, this.z), new Vector2f(vector3f.getY(), vector3f.getZ()));
        Matrix2f m2 = new Matrix2f(new Vector2f(this.x, this.z), new Vector2f(vector3f.getX(), vector3f.getZ()));
        Matrix2f m3 = new Matrix2f(new Vector2f(this.x, this.y), new Vector2f(vector3f.getX(), vector3f.getY()));
        return (i.multiplyByScalar(m1.determinant())).subtract(j.multiplyByScalar(m2.determinant())).add(k.multiplyByScalar(m3.determinant()));
    }
}
