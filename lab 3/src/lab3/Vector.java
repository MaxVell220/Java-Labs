package lab3;

import java.util.Arrays;

public class Vector {
    private int[] coordinates;

    public Vector() {
        this.coordinates = new int[3];
    }

    public Vector(int a, int b, int c) {
        this.coordinates = new int[3];
        coordinates[0] = a;
        coordinates[1] = b;
        coordinates[2] = c;
    }

    public Vector(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isOrthogonal(Vector other) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += this.coordinates[i] * other.coordinates[i];
        }
        return result == 0;
    }

    public boolean isCoplanar(Vector first, Vector second) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += this.coordinates[i] * first.coordinates[i] * second.coordinates[i];
        }
        return result == 0;
    }

    public boolean isIntersect(Vector other) {
        return !isOrthogonal(other);
    }

    public double length() {
        return Math.sqrt(coordinates[0] * coordinates[0] + coordinates[1] * coordinates[1] + coordinates[2] * coordinates[2]);
    }

    @Override
    public String toString() {
        return "Vector <" +
                Arrays.toString(coordinates) +
                '>';
    }

    public String compare(Vector other) {
        if (this.length() > other.length()) {
            return this.toString() + " > " + other;
        } else if (this.length() == other.length()) {
            return this.toString() + " == " + other;
        } else {
            return this.toString() + " < " + other;
        }
    }
}
