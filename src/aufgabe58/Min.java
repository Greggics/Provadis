package aufgabe58;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {

    }

    public int minimum(int num1, int num2) {
        return Math.min(num1,num2);
    }
    public int minimum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public byte minimum(byte num1, byte num2) {
        return num1 < num2 ? num1 : num2;
    }

    public short minimum(short num1, short num2) {
        return num1 < num2 ? num1 : num2;
    }

    public long minimum(long num1, long num2) {
        return Math.min(num1, num2);
    }

    public float minimum(float num1, float num2) {
        return Math.min(num1, num2);
    }

    public double minimum(double num1, double num2) {
        return Math.min(num1, num2);
    }

}
