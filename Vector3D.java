import java.util.Vector;

public class Vector3D {

    double x;
    double y;
    double z;

    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        System.out.printf("(%.2f, %.2f, %.2f)%n", x, y, z);
        return null;
    }

    public double getMagnitude() {
        return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
    }

    public Vector3D normalize() {
        if (getMagnitude() <= 0) {
            throw new IllegalStateException();
        } else {
            double origMag = getMagnitude();
            return new Vector3D(this.x / origMag, this.y / origMag, this.z / origMag);
        }
    }

    public Vector3D add(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.x + vector2.x, vector1.y + vector2.y, vector1.z + vector2.z);
    }

    public Vector3D multiply(Vector3D vector, double constant) {
        return new Vector3D(vector.x * constant, vector.y * constant, vector.z * constant);
    }

    public double dotProduct(Vector3D vector1, Vector3D vector2) {
        return (vector1.x * vector2.x) + (vector1.y * vector2.y) + (vector1.z * vector2.z);
    }

    public double angleBetween(Vector3D vector1, Vector3D vector2) {
        return dotProduct(vector1, vector2) / Math.abs(dotProduct(vector1, vector2));
    }
}
