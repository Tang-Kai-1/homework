package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength >= 300) {
            System.out.println("Exceeds maximum size.");
            return false;
        }
        if (xLength < 30) {
            System.out.println("X side too small.");
            return false;
        }
        if (yLength < 30) {
            System.out.println("Y side too small.");
            return false;
        }
        if (zLength < 30) {
            System.out.println("Z side too small.");
            return false;
        }
        if (!isExpress && weight > 30) {
            System.out.println("Exceeds weight limit.");
            return false;
        }
        if (isExpress && weight > 15) {
            System.out.println("Exceeds weight limit for express.");
            return false;
        }
        return true;
    }
}
