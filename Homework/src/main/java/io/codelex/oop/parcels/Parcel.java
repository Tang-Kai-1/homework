package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private int side = 30;
    private static final int maxSideSum = 300;
    private static final int maxWeight = 30;
    private static final int maxWeightExpress = 15;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength >= maxSideSum) {
            System.out.println("Exceeds maximum size.");
            return false;
        }
        if (xLength < side) {
            System.out.println("X side too small.");
            return false;
        }
        if (yLength < side) {
            System.out.println("Y side too small.");
            return false;
        }
        if (zLength < side) {
            System.out.println("Z side too small.");
            return false;
        }
        if (!isExpress && weight > maxWeight) {
            System.out.println("Exceeds weight limit.");
            return false;
        }
        if (isExpress && weight > maxWeightExpress) {
            System.out.println("Exceeds weight limit for express.");
            return false;
        }
        return true;
    }
}
